
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    EntidadUsuario ev=new EntidadUsuario();
    Conexion con=new Conexion();
    Connection acceso;
    
    public EntidadUsuario ValidarUsuario(String usuario, String clave){
        String sql="select * from usuario where usuario=? and clave=?";
        try{
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs=ps.executeQuery();
            while(rs.next()){
                ev.setUsuario(usuario);
                ev.setClave(clave);
            }
        }
        catch(Exception e){
           
        }
        return ev;
    }
}
