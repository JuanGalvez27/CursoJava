package com.juan;

import javax.swing.*;

public class L18Factorial {
    public static void main(String[] args) {
        int resultado = 1;
        int factorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for(int i = factorial; i>0; i--){
            resultado = resultado *i;
        }
        System.out.println("El factorial de "+ factorial + " es " + resultado);
    }
}