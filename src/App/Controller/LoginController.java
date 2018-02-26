package App.Controller;

import App.Helpers.FunctionsGenerals;
import App.Helpers.Messages;
import App.Model.LoginModel;
import App.ObjectBusinessData.LoginObjectBusiness;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Bismarck Franco
 */
public class LoginController implements Initializable {

    @FXML ImageView ImageViewLogin;
    @FXML Pane PanelOverAll;
    @FXML ImageView BtnSalir;
    @FXML Button btnLogin;
    @FXML JFXTextField textUserName;
    @FXML JFXPasswordField textPassword;
    
    LoginObjectBusiness LoginBusiness;
    Messages ShowMessages;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LoginBusiness = new LoginObjectBusiness();
        ShowMessages = new Messages();
        ImgBorderRound();
        FunctionsGenerals.GetInstance().addDraggableNode(PanelOverAll);
        Salir();
        Login();
    }  
    
    private void Salir(){
        BtnSalir.setOnMouseClicked((MouseEvent t) -> {System.exit(0);});
    }
    
    private void Login(){
        btnLogin.setOnAction((ActionEvent t) ->{
            LoginModel x = new LoginModel();
            x.setUserName(textUserName.getText());
            x.setPassword(textPassword.getText());
            if (LoginBusiness.Login(x)) {
                ShowMessages.OkMesg("Bienvenido" + x.getUserName());
            }else{
                ShowMessages.ErrorMsg("Los Datos ingresados no son los correctos");
            }
        });
    }
       
    private void ImgBorderRound(){
        // set a clip to apply rounded border to the original image.
        Rectangle clip = new Rectangle(ImageViewLogin.getFitWidth(),ImageViewLogin.getFitHeight());
        clip.setArcWidth(22);
        clip.setArcHeight(22);
        ImageViewLogin.setClip(clip);

        // snapshot the rounded image.
        SnapshotParameters parameters = new SnapshotParameters();
        parameters.setFill(Color.TRANSPARENT);
        WritableImage image = ImageViewLogin.snapshot(parameters, null);

        // remove the rounding clip so that our effect can show through.
        ImageViewLogin.setClip(null);

        // store the rounded image in the ImageViewLogin.
        ImageViewLogin.setImage(image);
    }
}

//        String x = SAIP_MASTER_MAIN.class.getResource("Resources/Video/Ipad.mp4").toString();
//        Media media = new Media(x); 
//        media.setOnError(() -> System.out.println("error media"));
//
//        MediaPlayer player = new MediaPlayer(media);
//        player.setOnError(() -> System.out.println("error player"));
//        player.setCycleCount(MediaPlayer.INDEFINITE);
//        player.setStartTime(Duration.seconds(0));
//        player.setStopTime(Duration.seconds(7));
//        player.setAutoPlay(true);
//
//        MediaViewLogin.setMediaPlayer(player);