package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Andres
 */
public class Conexion {

    Connection con;
    

    public Connection Conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd", "root", "");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.err.println("Error en conexion " + e);
        }
        
        return con;
    }
}
