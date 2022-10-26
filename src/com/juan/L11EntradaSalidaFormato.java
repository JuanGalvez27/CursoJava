package com.juan;

import javax.swing.*;

public class L11EntradaSalidaFormato {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
        System.out.print("La raíz cuadrada de " + x +" es: ");
        System.out.printf("%1.2f", Math.sqrt(x)); // Imprimir con formato. dando formato entre comillas,
    }
}
