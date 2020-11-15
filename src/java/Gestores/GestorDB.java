package Gestores;

import Modelos.Articulo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Pablo
 */
public class GestorDB {
    
    private Connection conn;
    private String CONN = "jdbc:sqlserver://DESKTOP-EVURPOV\\SQLEXPRESS:1433;databaseName=TpLab4-RegaleriaCasorio";
    private String USER = "sa";
    private String PASS = "123Cambiar";
    
    public void abrirConexion(){
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(CONN, USER, PASS);
            } 
        catch (Exception exc) {
                exc.printStackTrace();
            }
    }
    
    public void cerrarConexion() {
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
            }
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    public ArrayList<Articulo> getArticulos(){
        ArrayList<Articulo> listaArticulo = new ArrayList<>();
        
        try{
            abrirConexion();
            
            Statement st = conn.createStatement();
            String query = "SELECT * FROM Articulos";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                int id_articulo = rs.getInt("id_articulo");
                String nombre = rs.getString("nombre");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                
                Articulo a = new Articulo(id_articulo,nombre,precio,descripcion);
                listaArticulo.add(a);
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return listaArticulo;
    }
    
}
