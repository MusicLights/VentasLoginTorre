
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_torre";
    String user="root";
    String pass="admin";
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
        }
       return con;
    }
}
