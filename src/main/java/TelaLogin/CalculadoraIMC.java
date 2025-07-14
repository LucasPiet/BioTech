/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC extends JFrame {
    private JTextField heightField;
    private JTextField weightField;
    private JButton calculateButton;
    private JButton backButton;
    private JLabel resultLabel;

    public CalculadoraIMC() {
        
        setTitle("Calculadora de IMC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        JLabel heightLabel = new JLabel("Altura (m):");
        heightLabel.setBounds(50, 50, 100, 30);
        add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(150, 50, 150, 30);
        add(heightField);

        
        JLabel weightLabel = new JLabel("Peso (kg):");
        weightLabel.setBounds(50, 100, 100, 30);
        add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(150, 100, 150, 30);
        add(weightField);

        
        calculateButton = new JButton("Calcular IMC");
        calculateButton.setBounds(50, 150, 150, 30);
        add(calculateButton);

        
        backButton = new JButton("Voltar");
        backButton.setBounds(210, 150, 150, 30);
        add(backButton);
        

        
        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 300, 30);
        add(resultLabel);

       
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateIMC();
            }
        });

        // Ação do botão de voltar
        backButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                TelaPrincipalIMC Tela = new TelaPrincipalIMC();
        Tela.setVisible(true);
        
            }
        });
    }

    private void calculateIMC() {
        try {
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double imc = weight / (height * height);

            String classification;
            String obesityGrade;

            if (imc < 18.5) {
                classification = "Magreza";
                obesityGrade = "0";
            } else if (imc < 25.0) {
                classification = "Normal";
                obesityGrade = "0";
            } else if (imc < 30.0) {
                classification = "Sobrepeso";
                obesityGrade = "I";
            } else if (imc < 40.0) {
                classification = "Obesidade";
                obesityGrade = "II";
            } else {
                classification = "Obesidade Grave";
                obesityGrade = "III";
            }

            resultLabel.setText(String.format("IMC: %.2f - %s (Grau %s)", imc, classification, obesityGrade));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Por favor, insira valores válidos.");
        }
    }

    private void clearFields() {
        heightField.setText("");
        weightField.setText("");
        resultLabel.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraIMC().setVisible(true);
            }
        });
    }
}