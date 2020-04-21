
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexionbd 
{
private final String nomBdd = "jdbc:mysql://localhost/ejercicio10";    
private final String Clave = "";
private final String User = "root";
//Variable
  private final String Driver = "com.mysql.jdbc.Driver";
  protected Connection Conectar = null;
          
   public conexionbd() 
    {
        try 
        {
          Class.forName(Driver);//localizacion del driver
          Conectar = DriverManager.getConnection(nomBdd, User, Clave); 
      
        } 
        catch (ClassNotFoundException | SQLException  e) 
        {
            JOptionPane.showMessageDialog(null, "error, no se conectó a la bdd" + e);
        }
    }
       public Connection Conectado()
    {
        return Conectar;
    }
    
    public void Desconectar()
    {
       Conectar = null;
        if (Conectar == null) 
        {
            JOptionPane.showMessageDialog(null, "Desconectando");
        }
    }
}
