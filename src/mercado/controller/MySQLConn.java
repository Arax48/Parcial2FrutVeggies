package mercado.controller;

import java.sql.*;
//import java.util.*;

public class MySQLConn {

    //Esta primera linea, permite instanciar un objeto para
    // la conexión entre el IDE y la BD
private static Connection con;



    private static final String driver="com.mysql.cj.jdbc.Driver";

    private static final String user="root";

    private static final String pass="_3GTh=FB<s{7l6B";
    
    private static final String url="jdbc:mysql://localhost:3306/alimentos";
    
    public void conectar(String alimento) {
      
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos al gestor de bd
            con= DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
      
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
        }   
        
    }
}
    
