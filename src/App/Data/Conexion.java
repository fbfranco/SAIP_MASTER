package App.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bismarck Franco
 */
public class Conexion {
    
    public static Conexion Instance = new Conexion();
    
    public String db="saip_db";
    public String url="jdbc:mysql://127.0.0.1/"+db;
    public String user="fbfranco";
    public String pass="69101806";
    private Connection cn;
    
    
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized static Conexion comprobarEstado() {
        return Instance = Instance == null ? Instance = new Conexion() : Instance;
    }
    public Connection getCn() {
        return cn;
    }
    
    public void cerrarConexion() {
        Conexion.Instance = null;
    }
    
}
