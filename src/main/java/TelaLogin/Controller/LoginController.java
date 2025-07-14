/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin.Controller;


import TelaLogin.TelaCadastro;
import TelaLogin.Dao.Conexão;
import TelaLogin.Dao.LoginDAO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author unive
 */
public class LoginController {
 public void cadastroUsuario(TelaCadastro view) throws SQLException{
 Connection Conexão = new Conexão().getConnection();
 LoginDAO cadastro = new LoginDAO();
 cadastro.cadastrarUsuario(view.getjTextFieldCPF().getText(), view.getjTextFieldEmail().getText(), view.getJUsuarioTextField().getText(), view.getJSenhaField().getText());       
 }
 
}

