package com.juan.poo;

import javax.swing.*;

public class UsoCoche {
    public static void main(String[] args) {
        Coche Renault = new Coche(); // Instanciar una clase. Renault: Instancia de la clase Coche
        // Para acceder a las propiedades de los metodos lo mejor es hacerlo
        // a traves de los metodos
        System.out.println(Renault.getMotor());
        Renault.setColor(JOptionPane.showInputDialog("Inserte el color"));
        System.out.println(Renault.getColor());
        System.out.println(Renault.getData());
        Renault.setAsientosCuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(Renault.getAsientosCuero());
        Renault.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(Renault.getClimatizador());
    }
}
