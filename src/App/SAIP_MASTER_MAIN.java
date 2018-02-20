package App;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Bismarck Franco
 */
public class SAIP_MASTER_MAIN extends Application {
    
    private Stage stage;  
    private BorderPane MainContainer;
    javafx.geometry.Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
    
    @Override
    public void start(Stage stage) throws Exception {
         try {
            this.stage = stage;
            stage.setTitle("SAIP");                     
            initMainContainer();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }     
    }

    public void initMainContainer() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(SAIP_MASTER_MAIN.class.getResource("View/LoginView.fxml"));
            MainContainer = (BorderPane) loader.load();
            
            Scene scene = new Scene(MainContainer);
            scene.setFill(Color.TRANSPARENT);
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            setViewCenter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setViewCenter(){
        stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2); 
        stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2); 
    }
//    private Initializable replaceSceneContent(String fxml) throws Exception {
//        FXMLLoader loader = new FXMLLoader();
//        InputStream in = SAIP_MASTER_MAIN.class.getResourceAsStream(fxml);
//        loader.setBuilderFactory(new JavaFXBuilderFactory());
//        loader.setLocation(SAIP_MASTER_MAIN.class.getResource(fxml));
//        BorderPane page;
//        try {
//            page = (BorderPane) loader.load(in);
//        } finally {
//            in.close();
//        } 
//        Scene scene = new Scene(page, 280,380);
//        scene.setFill(Color.TRANSPARENT);
//        stage.setScene(scene);
//        stage.sizeToScene();
//        stage.initStyle(StageStyle.TRANSPARENT);
//        
//        return (Initializable) loader.getController();
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
