package TelaLogin;

import TelaLogin.GlobalVariables; // Importar a classe de variáveis globais
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaPrincipalAgua extends javax.swing.JFrame {

    public TelaPrincipalAgua() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        HomeText = new javax.swing.JLabel();
        SonoText1 = new javax.swing.JLabel();
        SonoText2 = new javax.swing.JLabel();
        SonoText3 = new javax.swing.JLabel();
        AguaText1 = new javax.swing.JLabel();
        AguaText2 = new javax.swing.JLabel();
        AguaText3 = new javax.swing.JLabel();
        IMCText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        HomeImagen = new javax.swing.JLabel();
        AguaImagem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IMCImagem = new javax.swing.JLabel();
        SonoImagem = new javax.swing.JLabel();
        ExitImagem = new javax.swing.JLabel();
        FundoParaTirarBorda = new javax.swing.JPanel();
        MedidorDeAgua = new javax.swing.JButton();
        IMC = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        TempoDeSono = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ImagemPulseFit = new javax.swing.JLabel();
        ImagenNotificação = new javax.swing.JLabel();
        BotãoNotificação = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PulseFit");
        setMinimumSize(new java.awt.Dimension(1050, 470));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        HomeText.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        HomeText.setForeground(new java.awt.Color(0, 0, 0));
        HomeText.setText("Sobre nós");
        jPanel2.add(HomeText);
        HomeText.setBounds(70, 70, 80, 30);

        SonoText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SonoText1.setForeground(new java.awt.Color(0, 0, 0));
        SonoText1.setText("Sono");
        jPanel2.add(SonoText1);
        SonoText1.setBounds(90, 320, 50, 20);

        SonoText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SonoText2.setForeground(new java.awt.Color(0, 0, 0));
        SonoText2.setText("Gestão");
        jPanel2.add(SonoText2);
        SonoText2.setBounds(80, 280, 60, 20);

        SonoText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SonoText3.setForeground(new java.awt.Color(0, 0, 0));
        SonoText3.setText("de");
        jPanel2.add(SonoText3);
        SonoText3.setBounds(100, 300, 30, 20);

        AguaText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AguaText1.setForeground(new java.awt.Color(0, 0, 0));
        AguaText1.setText("Consumo ");
        jPanel2.add(AguaText1);
        AguaText1.setBounds(70, 190, 90, 40);

        AguaText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AguaText2.setForeground(new java.awt.Color(0, 0, 0));
        AguaText2.setText("Água");
        AguaText2.setToolTipText("");
        jPanel2.add(AguaText2);
        AguaText2.setBounds(90, 240, 50, 30);

        AguaText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AguaText3.setForeground(new java.awt.Color(0, 0, 0));
        AguaText3.setText("de");
        jPanel2.add(AguaText3);
        AguaText3.setBounds(100, 220, 30, 24);

        IMCText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        IMCText.setForeground(new java.awt.Color(0, 0, 0));
        IMCText.setText("IMC");
        jPanel2.add(IMCText);
        IMCText.setBounds(90, 140, 40, 20);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 120, 150, 60);

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 190, 150, 80);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 280, 150, 60);

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 46, 150, 60);

        HomeImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\casa.png")); // NOI18N
        jPanel2.add(HomeImagen);
        HomeImagen.setBounds(10, 40, 60, 70);

        AguaImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\bebida.png")); // NOI18N
        jPanel2.add(AguaImagem);
        AguaImagem.setBounds(0, 200, 60, 64);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\OneDrive\\Imagens\\PulseFit.jpg")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 190, 150, 80);

        IMCImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\balanca (3).png")); // NOI18N
        jPanel2.add(IMCImagem);
        IMCImagem.setBounds(10, 120, 60, 60);

        SonoImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\sono-suficiente.png")); // NOI18N
        SonoImagem.setToolTipText("");
        jPanel2.add(SonoImagem);
        SonoImagem.setBounds(10, 280, 70, 60);

        ExitImagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExitImagem.setForeground(new java.awt.Color(0, 0, 0));
        ExitImagem.setText("X");
        jPanel2.add(ExitImagem);
        ExitImagem.setBounds(10, 0, 30, 20);

        FundoParaTirarBorda.setBackground(new java.awt.Color(255, 255, 255));
        FundoParaTirarBorda.setForeground(new java.awt.Color(255, 255, 255));
        FundoParaTirarBorda.setLayout(null);
        jPanel2.add(FundoParaTirarBorda);
        FundoParaTirarBorda.setBounds(0, 0, 150, 440);

        MedidorDeAgua.setBackground(new java.awt.Color(255, 255, 255));
        MedidorDeAgua.setForeground(new java.awt.Color(0, 0, 0));
        MedidorDeAgua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        MedidorDeAgua.setBorderPainted(false);
        MedidorDeAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(MedidorDeAgua);
        MedidorDeAgua.setBounds(0, 190, 150, 80);

        IMC.setBackground(new java.awt.Color(255, 255, 255));
        IMC.setForeground(new java.awt.Color(255, 255, 255));
        IMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        IMC.setBorderPainted(false);
        IMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMCActionPerformed(evt);
            }
        });
        jPanel2.add(IMC);
        IMC.setBounds(0, 110, 150, 80);

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setBorder(null);
        Home.setBorderPainted(false);
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.setFocusPainted(false);
        Home.setNextFocusableComponent(HomeImagen);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel2.add(Home);
        Home.setBounds(0, 40, 150, 70);

        TempoDeSono.setBackground(new java.awt.Color(255, 255, 255));
        TempoDeSono.setForeground(new java.awt.Color(255, 255, 255));
        TempoDeSono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TempoDeSono.setBorderPainted(false);
        TempoDeSono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TempoDeSono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempoDeSonoActionPerformed(evt);
            }
        });
        jPanel2.add(TempoDeSono);
        TempoDeSono.setBounds(0, 270, 150, 80);

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setForeground(new java.awt.Color(0, 0, 0));
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ExitButton);
        ExitButton.setBounds(0, 0, 30, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 150, 680);

        jButton1.setText("ADD");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 180, 72, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 180, 120, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Coloque a quantidade  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 110, 190, 21);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("consumida abaixo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 150, 180, 21);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("de agua diariamente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 130, 170, 21);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Clique na tela para calcular a quantidade de necessaria de agua");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 30, 580, 20);

        ImagemPulseFit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ImagemPulseFit.setForeground(new java.awt.Color(0, 0, 0));
        ImagemPulseFit.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\OneDrive\\Imagens\\PulseFit.jpg")); // NOI18N
        ImagemPulseFit.setText("consumida abaixo:");
        getContentPane().add(ImagemPulseFit);
        ImagemPulseFit.setBounds(70, 0, 960, 440);

        ImagenNotificação.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\cuidado (1).png")); // NOI18N
        ImagenNotificação.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(ImagenNotificação);
        ImagenNotificação.setBounds(150, 0, 32, 30);

        BotãoNotificação.setText("jButton2");
        BotãoNotificação.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoNotificação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoNotificaçãoActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoNotificação);
        BotãoNotificação.setBounds(150, 0, 30, 30);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 0, 870, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        TelaPrincipalHome Tela = new TelaPrincipalHome();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void IMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMCActionPerformed
        TelaPrincipalIMC Tela = new TelaPrincipalIMC();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IMCActionPerformed

    private void TempoDeSonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempoDeSonoActionPerformed
        TelaPrincipalSono Tela = new TelaPrincipalSono();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TempoDeSonoActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        telaLogin Tela = new telaLogin();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BotãoNotificaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoNotificaçãoActionPerformed
        // Adicione sua lógica aqui
    }//GEN-LAST:event_BotãoNotificaçãoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CalculoAguaGUI Tela = new CalculoAguaGUI();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obter a quantidade de água do campo de texto
        String quantidadeAgua = jTextField1.getText();

        // Conectar ao banco de dados e inserir/atualizar a quantidade de água
        try {
            // Registrar o driver MariaDB
            Class.forName("org.mariadb.jdbc.Driver");

            // Conectar ao banco de dados
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user_data", "root", "admin")) {

                // Atualizar a quantidade de água consumida para o usuário logado
                String sql = "UPDATE users_information SET agua = ? WHERE id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, quantidadeAgua);
                    stmt.setInt(2, GlobalVariables.getUserID());
                    stmt.executeUpdate();

                    // Exibir mensagem de sucesso
                    JOptionPane.showMessageDialog(this, "Quantidade de água atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Driver JDBC não encontrado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalAgua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAgua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAgua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAgua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAgua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AguaImagem;
    private javax.swing.JLabel AguaText1;
    private javax.swing.JLabel AguaText2;
    private javax.swing.JLabel AguaText3;
    private javax.swing.JButton BotãoNotificação;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ExitImagem;
    private javax.swing.JPanel FundoParaTirarBorda;
    private javax.swing.JButton Home;
    private javax.swing.JLabel HomeImagen;
    private javax.swing.JLabel HomeText;
    private javax.swing.JButton IMC;
    private javax.swing.JLabel IMCImagem;
    private javax.swing.JLabel IMCText;
    private javax.swing.JLabel ImagemPulseFit;
    private javax.swing.JLabel ImagenNotificação;
    private javax.swing.JButton MedidorDeAgua;
    private javax.swing.JLabel SonoImagem;
    private javax.swing.JLabel SonoText1;
    private javax.swing.JLabel SonoText2;
    private javax.swing.JLabel SonoText3;
    private javax.swing.JButton TempoDeSono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
