
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductosDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion acceso=new Conexion();
   
    
    
    public Productos listarID(int id){
        Productos p=new Productos();
        String sql="select * from producto where idproducto=?";
        try{
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNomproductos(rs.getString(2));
                p.setCantidadproductos(rs.getInt(3));
                p.setPrecioproductos(rs.getInt(4));
                p.setTotalproductos(rs.getInt(5));
            }
        }
        
        catch(Exception e){
            
        }
        return p;
    }
}
