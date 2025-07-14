package TelaLogin;

import TelaLogin.GlobalVariables; // Importar a classe de variáveis globais

public class telaLogin extends javax.swing.JFrame {
    public telaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EXIT = new javax.swing.JLabel();
        BotãoLogin = new javax.swing.JButton();
        BotãoCadastro = new javax.swing.JButton();
        UsuarioText = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        Titulo = new javax.swing.JLabel();
        SenhaTextLabel = new javax.swing.JLabel();
        UsuarioTextLabel = new javax.swing.JLabel();
        ImagemFundo = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(725, 520));
        getContentPane().setLayout(null);

        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setText("X");
        getContentPane().add(EXIT);
        EXIT.setBounds(10, 0, 50, 30);

        BotãoLogin.setText("Login");
        BotãoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoLogin);
        BotãoLogin.setBounds(480, 370, 90, 23);

        BotãoCadastro.setText("Cadastrar");
        BotãoCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoCadastro);
        BotãoCadastro.setBounds(590, 370, 90, 23);
        getContentPane().add(UsuarioText);
        UsuarioText.setBounds(500, 240, 160, 30);
        getContentPane().add(Senha);
        Senha.setBounds(500, 300, 160, 30);

        Titulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 204, 204));
        Titulo.setText("BioTech");
        getContentPane().add(Titulo);
        Titulo.setBounds(40, 100, 180, 90);

        SenhaTextLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SenhaTextLabel.setForeground(new java.awt.Color(204, 204, 204));
        SenhaTextLabel.setText("Senha:");
        getContentPane().add(SenhaTextLabel);
        SenhaTextLabel.setBounds(500, 270, 70, 20);

        UsuarioTextLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsuarioTextLabel.setForeground(new java.awt.Color(204, 204, 204));
        UsuarioTextLabel.setText("Usuario:");
        getContentPane().add(UsuarioTextLabel);
        UsuarioTextLabel.setBounds(500, 220, 60, 19);

        ImagemFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\OneDrive\\Imagens\\960x0.jpg")); // NOI18N
        getContentPane().add(ImagemFundo);
        ImagemFundo.setBounds(-80, 0, 830, 500);

        Exit.setBackground(new java.awt.Color(8, 5, 50));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(0, 0, 40, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoCadastroActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadastro Tela = new TelaCadastro();
        Tela.setVisible(true);
        this.dispose();
    }

    private void BotãoLoginActionPerformed(java.awt.event.ActionEvent evt) {
        // Obter os valores dos campos
        String usuario = UsuarioText.getText();
        String senha = new String(Senha.getPassword());

        // Conectar ao banco de dados e verificar os dados
        try {
            // Registrar o driver MariaDB
            Class.forName("org.mariadb.jdbc.Driver");

            // Conectar ao banco de dados
            try (java.sql.Connection conn = java.sql.DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user_data", "root", "admin")) {

                // Preparar a consulta
                String sql = "SELECT id FROM users_login WHERE usuario = ? AND senha = ?";
                try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, usuario);
                    stmt.setString(2, senha);

                    // Executar a consulta
                    try (java.sql.ResultSet rs = stmt.executeQuery()) {
                        if (rs.next()) {
                            // Login bem-sucedido, armazenar o ID do usuário
                            int userID = rs.getInt("id");
                            GlobalVariables.setUserID(userID); // Atualizar a variável global

                            // Exibir mensagem de sucesso
                            javax.swing.JOptionPane.showMessageDialog(this, "Login realizado com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            javax.swing.JOptionPane.showMessageDialog(this, "ID do Usuário: " + GlobalVariables.getUserID(), "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                            // Redirecionar para a próxima tela
                            TelaPrincipal Tela = new TelaPrincipal();
                            Tela.setVisible(true);
                            this.dispose();
                        } else {
                            // Login falhou, exibir mensagem de erro
                            javax.swing.JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (java.sql.SQLException e) {
            // Exibir mensagem de erro em caso de falha
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados: " + e.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            // Exibir mensagem de erro se o driver não for encontrado
            javax.swing.JOptionPane.showMessageDialog(this, "Driver JDBC não encontrado: " + e.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCadastro;
    private javax.swing.JButton BotãoLogin;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JLabel SenhaTextLabel;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField UsuarioText;
    private javax.swing.JLabel UsuarioTextLabel;
    // End of variables declaration//GEN-END:variables
}
