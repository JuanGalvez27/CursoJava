package com.juan;

import javax.swing.*;

public class L19MatricesForEach {
    public static void main(String[] args) {
        /*int [] myArray = new int[5];
        myArray[0]=1;
        myArray[1]=3;
        myArray[2]=5;
        myArray[3]=2;
        myArray[4]=7;

        int[] myArray = {1, 3, 5, 2, 7}; // Declaración implícita o simplificada

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }*/

        /*String[] paises = new String[8];
        paises[0] = "España";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Perú";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";*

         */
        // String [] paises = {"España", "Mexico", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
        String [] paises = new String[8];
        for(int i = 0; i<8; i++){
            paises[i] = JOptionPane.showInputDialog("Introduca país " + (i+1) + ":");
        }
        /*for(int i = 0; i < paises.length; i++){
            System.out.println("Pais " + (i+1) + " " + paises[i]);
        }*/

        for(String elemento: paises){
            System.out.println("País: " + elemento);
        }
    }
}
