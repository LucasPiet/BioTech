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
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {
    public void cadastrarUsuario(String cpf,String email,String usuario,String senha)throws SQLException{
    Connection Conexão = new Conexão ().getConnection();
    String sql  = "insert into usuarios (cpf,email,usuario,senha,) values('"+cpf+"','"+email+"','"+usuario+"','"+senha+"')";
    PreparedStatement statement = Conexão.prepareStatement(sql); 
    statement.execute();  
    Conexão.close();
    
    }
}

    