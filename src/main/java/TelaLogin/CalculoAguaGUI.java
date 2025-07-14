/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin;

/**
 *
 * @author unive
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoAguaGUI extends JFrame {
    private JTextField pesoField;
    private JTextField alturaField;
    private JLabel resultadoLabel;

    public CalculoAguaGUI() {
        
        setTitle("Calculadora de Água");
        setSize(550, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        
        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField();

        JLabel alturaLabel = new JLabel("Altura (m):");
        alturaField = new JTextField();

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new CalcularButtonListener());

        resultadoLabel = new JLabel("Você deve tomar: ");

        JButton voltarButton = new JButton("Voltar");
        voltarButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                TelaPrincipalAgua Tela = new TelaPrincipalAgua();
                Tela.setVisible(false);
               
            }
        });

        // Adição dos componentes à janela
        add(pesoLabel);
        add(pesoField);
        add(alturaLabel);
        add(alturaField);
        add(calcularButton);
        add(resultadoLabel);
        add(voltarButton);

        setVisible(true);
    }

    private class CalcularButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            try {
                double peso = Double.parseDouble(pesoField.getText());
                double altura = Double.parseDouble(alturaField.getText());

                // Calcula a quantidade de água recomendada (35 ml por kg de peso)
                double quantidadeAgua = peso * 35;

                // Converte para litros
                double quantidadeAguaLitros = quantidadeAgua / 1000;

                // Atualiza o resultado na interface
                resultadoLabel.setText(String.format("Você deve tomar: %.2f litros de água por dia.", quantidadeAguaLitros));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculoAguaGUI::new);
    }
}
