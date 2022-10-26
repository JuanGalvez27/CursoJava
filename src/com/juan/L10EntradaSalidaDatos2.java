package com.juan;

import javax.swing.*; // Import de ese paquete todos los métodos de la clase JOptionPane
import static java.lang.Integer.parseInt;

public class L10EntradaSalidaDatos2 {
    public static void main(String[] args) {
        //JOptionPane
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu npmbre, por favor");
        int edadUsusario = parseInt(JOptionPane.showInputDialog("Introuduce tu edad:"));
        // Se declara la edad como un dato tipo String ya que
        // el método showInputDialog recibe como parámetro un
        // String
        System.out.println("Hola, " + nombreUsuario + ", tienes " + edadUsusario + " años");
        System.out.println("El otro años cumples " + (edadUsusario+1));
    }
}
