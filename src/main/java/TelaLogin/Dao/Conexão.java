/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin.Dao;

/**
 *
 * @author unive
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexão {
   private static final String URL = "jdbc:postgresql://localhost:5432/postgre";
    private static final String USER = "postgre";
    private static final String PASSWORD = "************";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    
    
    }
};;
