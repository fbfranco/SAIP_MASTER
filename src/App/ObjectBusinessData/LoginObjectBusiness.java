package App.ObjectBusinessData;

import App.Data.LoginData;
import App.Model.LoginModel;

/**
 *
 * @author Bismarck Franco
 */
public class LoginObjectBusiness {
    
    //------SINGLETON------//
    public static LoginObjectBusiness Instance = new LoginObjectBusiness();
    public static LoginObjectBusiness GetInstance(){
        LoginObjectBusiness x;
        return x = Instance == null ? new LoginObjectBusiness() : Instance;
    }
    
    public boolean Login(LoginModel modelo){
        boolean x;
        return x = LoginData.getInstance().Login(modelo).getLogin() == 1 ? true : false;
    }
    
}
