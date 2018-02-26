package App.Model;

/**
 *
 * @author Bismarck Franco
 */
public class LoginModel {
    
    //------CONSTRUCTOR------//
    public LoginModel() {
    }

    public LoginModel(String UserName, String Password, int Login) {
        this.UserName = UserName;
        this.Password = Password;
        this.Login = Login;
    }
    
    
    //------CAMPOS------//
    private String UserName;
    private String Password;
    private int Login;

    
    //------MÉTODOS------//
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getLogin() {
        return Login;
    }

    public void setLogin(int Login) {
        this.Login = Login;
    }
    
}
