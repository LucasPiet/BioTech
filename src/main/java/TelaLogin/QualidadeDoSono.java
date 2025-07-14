/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin;

/**
 *
 * @author kauebfo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class QualidadeDoSono extends JFrame {
    private JLabel lblHorarioDormir, lblHorarioAcordar;
    private JSpinner spinnerHorarioDormir, spinnerHorarioAcordar;
    private JButton btnSalvar;

    public QualidadeDoSono() {
        setTitle("Qualidade do Sono");
        setLayout(new FlowLayout());

        lblHorarioDormir = new JLabel("Horário de Dormir:");
        spinnerHorarioDormir = new JSpinner(new SpinnerDateModel());
        spinnerHorarioDormir.setEditor(new JSpinner.DateEditor(spinnerHorarioDormir, "HH:mm"));

        lblHorarioAcordar = new JLabel("Horário de Acordar:");
        spinnerHorarioAcordar = new JSpinner(new SpinnerDateModel());
        spinnerHorarioAcordar.setEditor(new JSpinner.DateEditor(spinnerHorarioAcordar, "HH:mm"));

        btnSalvar = new JButton("Salvar");

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date horarioDormir = (Date) spinnerHorarioDormir.getValue();
                Date horarioAcordar = (Date) spinnerHorarioAcordar.getValue();
                long duracaoSonoMillis = horarioAcordar.getTime() - horarioDormir.getTime();
                long duracaoSonoHoras = duracaoSonoMillis / (60 * 60 * 1000);
                TelaPrincipalSono Tela = new TelaPrincipalSono();
        Tela.setVisible(false);
        

                if (duracaoSonoHoras >= 7 && duracaoSonoHoras <= 9) {
                    JOptionPane.showMessageDialog(null, "A qualidade do seu sono está boa.");
                } else if (duracaoSonoHoras < 7 ) {
                    JOptionPane.showMessageDialog(null, "A qualidade do seu sono não está boa.Você precisa dormir mais!");
                } else if (duracaoSonoHoras > 9){
                    JOptionPane.showMessageDialog(null, "A qualidade do seu sono não está boa.Você precisa dormir menos!");

                }
            }
        });

        add(lblHorarioDormir);
        add(spinnerHorarioDormir);
        add(lblHorarioAcordar);
        add(spinnerHorarioAcordar);
        add(btnSalvar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QualidadeDoSono();
            }
        });
    }
}
