package App.Model;

import java.io.InputStream;
import java.sql.Timestamp;

/**
 *
 * @author Bismarck Franco
 */
public class LoginModel {
    
    //------CONSTRUCTOR------//
    public LoginModel() {
    }

    public LoginModel(int IdUsuario, String UserName, String Password, InputStream Imagen, int IdPersona, String Persona, int IdRol, String Rol, int Estado, String Creador, Timestamp FechaCreacion, Timestamp FechaActualizacion) {
        this.IdUsuario = IdUsuario;
        this.UserName = UserName;
        this.Password = Password;
        this.Imagen = Imagen;
        this.IdPersona = IdPersona;
        this.Persona = Persona;
        this.IdRol = IdRol;
        this.Rol = Rol;
        this.Estado = Estado;
        this.Creador = Creador;
        this.FechaCreacion = FechaCreacion;
        this.FechaActualizacion = FechaActualizacion;
    }
    
    
    //------CAMPOS------//
    private int IdUsuario;
    private String UserName;
    private String Password;
    private InputStream Imagen;
    private int IdPersona;
    private String Persona;
    private int IdRol;
    private String Rol;
    private int Estado;
    private String Creador;
    private Timestamp FechaCreacion;
    private Timestamp FechaActualizacion;

    //------MÉTODOS------//
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
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

    public InputStream getImagen() {
        return Imagen;
    }

    public void setImagen(InputStream Imagen) {
        this.Imagen = Imagen;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String Persona) {
        this.Persona = Persona;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String Creador) {
        this.Creador = Creador;
    }

    public Timestamp getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Timestamp FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public Timestamp getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(Timestamp FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }
}
