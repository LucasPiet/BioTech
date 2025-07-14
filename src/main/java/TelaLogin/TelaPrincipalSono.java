package TelaLogin;

import TelaLogin.GlobalVariables; // Importar a classe de variáveis globais
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaPrincipalSono extends javax.swing.JFrame {

    public TelaPrincipalSono() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HomeText = new javax.swing.JLabel();
        AguaText1 = new javax.swing.JLabel();
        AguaText2 = new javax.swing.JLabel();
        AguaText3 = new javax.swing.JLabel();
        SonoText1 = new javax.swing.JLabel();
        SonoText2 = new javax.swing.JLabel();
        SonoText3 = new javax.swing.JLabel();
        IMCText = new javax.swing.JLabel();
        HomeImagen = new javax.swing.JLabel();
        AguaImagem = new javax.swing.JLabel();
        IMCImagem = new javax.swing.JLabel();
        SonoImagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ExitImagem = new javax.swing.JLabel();
        DadosText1 = new javax.swing.JLabel();
        FundoParaTirarBorda = new javax.swing.JPanel();
        MedidorDeAgua = new javax.swing.JButton();
        IMC = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        TempoDeSono = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ImagenNotificação = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        ImagemPulseFit = new javax.swing.JLabel();
        BotãoNotificação = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PulseFit");
        setMinimumSize(new java.awt.Dimension(1050, 470));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 120, 150, 60);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 200, 150, 70);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 270, 150, 80);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 46, 150, 60);

        HomeText.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        HomeText.setForeground(new java.awt.Color(0, 0, 0));
        HomeText.setText("Sobre nós");
        jPanel2.add(HomeText);
        HomeText.setBounds(70, 70, 80, 30);

        AguaText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AguaText1.setForeground(new java.awt.Color(0, 0, 0));
        AguaText1.setText("Consumo ");
        jPanel2.add(AguaText1);
        AguaText1.setBounds(60, 190, 90, 40);

        AguaText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AguaText2.setForeground(new java.awt.Color(0, 0, 0));
        AguaText2.setText("Água");
        AguaText2.setToolTipText("");
        jPanel2.add(AguaText2);
        AguaText2.setBounds(80, 240, 50, 30);

        AguaText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AguaText3.setForeground(new java.awt.Color(0, 0, 0));
        AguaText3.setText("de");
        jPanel2.add(AguaText3);
        AguaText3.setBounds(90, 220, 30, 24);

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
        SonoText3.setBounds(100, 300, 20, 20);

        IMCText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        IMCText.setForeground(new java.awt.Color(0, 0, 0));
        IMCText.setText("IMC");
        jPanel2.add(IMCText);
        IMCText.setBounds(90, 140, 40, 20);

        HomeImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\casa.png")); // NOI18N
        jPanel2.add(HomeImagen);
        HomeImagen.setBounds(10, 40, 60, 70);

        AguaImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\bebida.png")); // NOI18N
        jPanel2.add(AguaImagem);
        AguaImagem.setBounds(0, 200, 60, 64);

        IMCImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\balanca (3).png")); // NOI18N
        jPanel2.add(IMCImagem);
        IMCImagem.setBounds(10, 120, 60, 60);

        SonoImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\sono-suficiente.png")); // NOI18N
        SonoImagem.setToolTipText("");
        jPanel2.add(SonoImagem);
        SonoImagem.setBounds(10, 280, 70, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\OneDrive\\Imagens\\PulseFit.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-3, 276, 160, 70);

        ExitImagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExitImagem.setForeground(new java.awt.Color(0, 0, 0));
        ExitImagem.setText("X");
        jPanel2.add(ExitImagem);
        ExitImagem.setBounds(10, 0, 30, 20);

        DadosText1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DadosText1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(DadosText1);
        DadosText1.setBounds(80, 380, 70, 30);

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
        MedidorDeAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedidorDeAguaActionPerformed(evt);
            }
        });
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

        ImagenNotificação.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\Downloads\\cuidado (1).png")); // NOI18N
        ImagenNotificação.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(ImagenNotificação);
        ImagenNotificação.setBounds(150, 0, 32, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Clique na tela para medir sua qualidade de sono.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 0, 610, 40);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Coloque como esta seu sono abaixo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 90, 310, 21);

        jButton2.setText("ADD");
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 120, 72, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 120, 170, 22);

        ImagemPulseFit.setIcon(new javax.swing.ImageIcon("C:\\Users\\unive\\OneDrive\\Imagens\\PulseFit.jpg")); // NOI18N
        getContentPane().add(ImagemPulseFit);
        ImagemPulseFit.setBounds(80, 0, 940, 440);

        BotãoNotificação.setText("jButton2");
        BotãoNotificação.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotãoNotificação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoNotificaçãoActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoNotificação);
        BotãoNotificação.setBounds(150, 0, 30, 30);

        jButton1.setText("Adicone seu periodo de sono");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 0, 870, 440);

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

    }//GEN-LAST:event_TempoDeSonoActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        telaLogin Tela = new telaLogin();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void MedidorDeAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedidorDeAguaActionPerformed
        TelaPrincipalAgua Tela = new TelaPrincipalAgua();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MedidorDeAguaActionPerformed

    private void BotãoNotificaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoNotificaçãoActionPerformed
        // Adicione sua lógica aqui
    }//GEN-LAST:event_BotãoNotificaçãoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        QualidadeDoSono Tela = new QualidadeDoSono();
        Tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obter a quantidade de sono do campo de texto
        javax.swing.JOptionPane.showMessageDialog(this, "ID do Usuário: " + GlobalVariables.getUserID(), "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        String quantidadeSono = jTextField1.getText();

        // Conectar ao banco de dados e inserir/atualizar a quantidade de sono
        try {
            // Registrar o driver MariaDB
            Class.forName("org.mariadb.jdbc.Driver");

            // Conectar ao banco de dados
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user_data", "root", "admin")) {

                // Atualizar a quantidade de sono para o usuário logado
                String sql = "UPDATE users_information SET sono = ? WHERE id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, quantidadeSono);
                    stmt.setInt(2, GlobalVariables.getUserID());
                    stmt.executeUpdate();

                    // Exibir mensagem de sucesso
                    JOptionPane.showMessageDialog(this, "Quantidade de sono atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(TelaPrincipalSono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalSono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AguaImagem;
    private javax.swing.JLabel AguaText1;
    private javax.swing.JLabel AguaText2;
    private javax.swing.JLabel AguaText3;
    private javax.swing.JButton BotãoNotificação;
    private javax.swing.JLabel DadosText1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}