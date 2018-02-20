package App.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 *
 * @author Bismarck Franco
 */
public class LoginController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        //oculta mensaje de error
//        txtMsgError.setVisible(false);
//        
//         //cuando cualquier de los  textfield gane foco 
//         //si existe mensaje de error visible -> se oculta
//        txtUser.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
//             if (newValue){
//                txtMsgError.setVisible(false);
//             }
//        });
//        txtPass.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
//             if (newValue){
//                txtMsgError.setVisible(false);
//             }
//        });
    }  
    
    private Stage stage;
    
    public void setStage (Stage stage){
        this.stage = stage;
    }   
    
}
