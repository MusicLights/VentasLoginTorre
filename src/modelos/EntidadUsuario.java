package modelos;

/**
 *
 * @author User
 */
public class EntidadUsuario {
    
    String usuario;
    String clave;
    
    public EntidadUsuario(){
        
    }

    public EntidadUsuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
     
}
