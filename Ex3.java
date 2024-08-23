package Atividades;

import javax.swing.*;

public class DivisionTable {

    public static void main(String[] args) {

        int divisor = 0;
        double result = 0;
        StringBuilder tableBuilder = new StringBuilder();
        
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para obter a tabuada da divisão: "));

        tableBuilder.append("TABUADA DA DIVISÃO POR ").append(divisor).append("\n\n");

        for (int dividend = divisor; dividend <= 10 * divisor; dividend += divisor) {
            result = (double) dividend / divisor;
            tableBuilder.append(dividend).append(" / ").append(divisor).append(" = ").append(result).append("\n");
        }

        JOptionPane.showMessageDialog(null, tableBuilder.toString());
    }
}
