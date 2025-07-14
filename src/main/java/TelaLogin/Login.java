/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin;

/**
 *
 * @author unive
 */
public class Login {
   private String idade,Usuario,email,senha,CPF;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

     public void cadastrar( String idade,String Usuario,String email,String senha,String CPF){ 
        this.idade = idade;
        this.Usuario = Usuario;
        this.email = email;
        this.senha = senha;
        this.CPF = CPF;
     }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}


