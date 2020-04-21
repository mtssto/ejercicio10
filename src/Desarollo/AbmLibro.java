
package Desarollo;

import Conexion.conexionbd;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AbmLibro 
{
private String Nombre;
private String Autor;
private String Tipo;
private int Edicion;
   
private PreparedStatement Instruccion;
private String AltaSQL = "INSERT INTO `ejercicio10`.`libro`(`NombreLibro`,`TipodeLibro`,`idAutor`,`Edicion`)VALUES(?,?,?,?);";
private String ConsultaSQL = "";
private String MuestroSQL = "Select `NombreLibro`,`TipodeLibro`,`idAutor`,`Edicion` from ejercicio10.libro;";
private String BorrarSQL = "DELETE FROM libro WHERE NombreLibro = (?)";
//Para mostrar los datos en el jtable
String [][] Filas = {}; //aca van a ir los datos que tomo de la tabla libros
String [] NomCol = {"Nombre del Libro" ,"Autor", "Genero",  "Edicion"}; //titulos del jtable
ResultSet Resultado;

DefaultTableModel Table;
conexionbd con = new conexionbd();

//DefaultListModel
    public AbmLibro(String Nombre, String Autor, String Tipo, int Edicion) 
    {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Tipo = Tipo;
        this.Edicion = Edicion;
    }

    public AbmLibro() {
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }
    
//metodos
public void Alta ()
{
    try 
    {
       Instruccion = con.Conectado().prepareStatement(AltaSQL);
       Instruccion.setString(1, this.getNombre());
       Instruccion.setString(2, this.getAutor());
       Instruccion.setString(3, this.getTipo());
       Instruccion.setString(4, String.valueOf(this.getEdicion()));
       
       int Registro = Instruccion.executeUpdate();
        if (Registro > 0) 
        {
            JOptionPane.showMessageDialog(null, "Se guardó el registro");
            con.Conectado().close();
        }
    } 
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "No se pudo guardar el registro" + e);
    }
}

public DefaultTableModel Titulo ()
        //imprime los titulos sin ningun registro
{
    Table = new DefaultTableModel (Filas, NomCol); //en el constructor van los datos y los titulos
return Table;
}

public DefaultTableModel MuestroDatos ()
{
   
    try 
    {
        Instruccion = con.Conectado().prepareStatement(MuestroSQL);
        Resultado = Instruccion.executeQuery();
        
        while (Resultado.next()) // no se usa un dowhile porque sino te tira un loop
        {
        this.setNombre(Resultado.getString(1));
        this.setTipo(Resultado.getString(2));
        this.setAutor(Resultado.getString(3));
        this.setEdicion(Resultado.getInt(4));
       
       
       String [] VecTabla = {this.getNombre(), this.getAutor(), this.getTipo(), String.valueOf(this.getEdicion())}; //en este vector le estoy devolviendo los datos con el metodo get
       Table.addRow(VecTabla); //Es porque estamos retornando ese objeto, envio los datos de mis campos a mi datatable
       
        }
        
    } catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "No puede mostrar los datos " + e);
    }
return Table;
}
public boolean Buscar (String Nombre) //porque va a tener un valor verdadero o falso
{
        String BuscarLibro = "Select `NombreLibro`,`idAutor`,`TipodeLibro`,`Edicion` from ejercicio10.libro where NombreLibro = '"+Nombre+"';";//en ese ++ voy a poner la variable del metodo buscar
       //JOptionPane.showMessageDialog(null, BuscarNro);
        boolean Encuentra = false; 
    
        try 
        {
            Instruccion = con.Conectado().prepareStatement(BuscarLibro);
        Resultado = Instruccion.executeQuery();
             if ( Resultado.next()) 
            {
            this.setNombre(Resultado.getString(1));
        this.setTipo(Resultado.getString(2));
        this.setAutor(Resultado.getString(3));
        this.setEdicion(Resultado.getInt(4));
            }
              Encuentra = true; // para que cuando me retorne esa variable tenga un valor
         } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se encuentra el departamento" + e);
            Encuentra = false;
        }
        finally //este procedemiento funciona sin importar si sale por try o catch, devuelve de todas formas.
        {return Encuentra;}
        
}
public void Modificar (String LibroViejo) //no devuelve nada por eso el void
{
    String Cambia ="UPDATE libro SET NombreLibro = '" + this.getNombre()+ "', idAutor = '" + this.getAutor() + "', TipodeLibro = '" + this.getTipo() + "', Edicion = '" + this.getEdicion() + "' WHERE NombreLibro = '" + LibroViejo + "';"; 
    
           try 
           {
            Instruccion = con.Conectado().prepareStatement(Cambia);
            int Registro = Instruccion.executeUpdate(); //Ejecuta un update
            if (Registro > 0)
            {
                JOptionPane.showMessageDialog(null, "Registro modificado con éxito");
                //Con.Conectado().close();
            }
            else
            {JOptionPane.showMessageDialog(null, "No actualizó el registro");}
        } 
           catch (SQLException e) 
        {
             JOptionPane.showMessageDialog(null, "El registro no pudo ser guardado" + e);
        }
    }
public void Baja ()
{
    try 
    {
        Instruccion = con.Conectado().prepareStatement(BorrarSQL);
        Instruccion.setString(1,this.getNombre()); //coloco la instruccion de que es lo que voy a borrar
         int Registro = Instruccion.executeUpdate();
        if (Registro > 0) 
        {
            JOptionPane.showMessageDialog(null, "El registro ha sido borrado");    
        }
    } 
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null,"No puede borrar el registro" + e);
    }
}
}
