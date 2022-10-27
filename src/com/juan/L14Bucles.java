package com.juan;

import javax.swing.*;

public class L14Bucles {
    public static void main(String[] args) {
        // indeterminados: while, do while
        // determinados: for, forEach
        String clave = "Juan";
        String pass = "";

        while(clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introuduce la contraseña: ");
            if(clave.equals(pass) == false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta");
    }

}
