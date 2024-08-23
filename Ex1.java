package Atividades;

import javax.swing.*;

public class SumCalculator {

    public static void main(String[] args) {

        double number = 0;
        double totalSum = 0;

        for (int count = 0; count < 5; count++) {

            number = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para somar:"));

            totalSum += number;
        }

        JOptionPane.showMessageDialog(null, "A soma total é: " + totalSum);
    }
}
