package App.Data;

import App.Helpers.Messages;
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
    public int Login(String UserName, String Password){
        int x;
        try {
            CallableStatement cst = CnMySql.getCn().prepareCall("{ call spLogin(?,?) }");
            cst.setString(1, UserName);
            cst.setString(2, Password);
            cst.execute();
            cst.getResultSet().next();
            x = cst.getResultSet().getInt(1);
            return x;
            
        } catch (Exception e) {
            Msg.ErrorMsg(e.toString());
            return x = 0;
        } 
    }
    
}
