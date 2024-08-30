package org.example;

import javax.swing.*;

public class MultiplicationTable {

    public static void main(String[] args) {

        int number = 0;
        int result = 0;
        StringBuilder tableBuilder = new StringBuilder();

        number = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para obter a tabuada da multiplicação: "));

        tableBuilder.append("TABUADA DO ").append(number).append("\n\n");

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            result = multiplier * number;
            tableBuilder.append(multiplier).append(" X ").append(number).append(" = ").append(result).append("\n");
        }

        JOptionPane.showMessageDialog(null, tableBuilder.toString());
    }
}
