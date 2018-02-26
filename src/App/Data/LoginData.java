package App.Data;

import App.Helpers.Messages;
import App.Model.LoginModel;
import java.sql.CallableStatement;

/**
 *
 * @author Bismarck Franco
 */
public class LoginData {
    
    //------SINGLETON------//
    private static LoginData Instance = new LoginData();
    public static LoginData getInstance(){
        return Instance = Instance == null ? new LoginData() : Instance;
    }
    
    //------INSTANCIAR COMUNICACIÓN CON OTRAS CLASES------//
    private final Conexion CnMySql = new Conexion();
    private final Messages Msg = new Messages();
    
    //----MÉTODO PARA LOGUEARSE AL SISTEMA----//
    public LoginModel Login(LoginModel login){
        LoginModel x;
        try {
            CallableStatement cst = CnMySql.getCn().prepareCall("{ call spLogin(?,?) }");
            cst.setString(1, login.getUserName());
            cst.setString(2, login.getPassword());
            cst.execute();
            cst.getResultSet().next();
            x = new LoginModel(login.getUserName(), login.getPassword(), cst.getResultSet().getInt(1));
            return x;
            
        } catch (Exception e) {
            Msg.ErrorMsg(e.toString());
            return x = null;
        } finally{
            CnMySql.cerrarConexion();
        }
    }
    
}
