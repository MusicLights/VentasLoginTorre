
package modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentasDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
     List<Productos> lista=new ArrayList<>();
     String sql="select * from productos";
     try{
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             Productos p=new Productos();
             p.setId(rs.getInt(1));
             p.setNomproductos(rs.getString(2));
             p.setCantidadproductos(rs.getInt(3));
             p.setPrecioproductos(rs.getInt(4));
             p.setTotalproductos(rs.getInt(5));
             lista.add(p);
         }
     }
     catch(Exception e){
          
     }
     
     return lista;
    }

 
    }


