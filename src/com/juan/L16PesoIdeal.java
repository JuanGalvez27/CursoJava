package com.juan;

import javax.swing.*;

public class L16PesoIdeal {
    public static void main(String[] args) {
        String genero;
        do{
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
        } while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        int pesonIdeal = 0;
        if(genero.equalsIgnoreCase("H")){
            pesonIdeal = altura - 110;
        }
        if(genero.equalsIgnoreCase("M")){
            pesonIdeal = altura - 120;
        }
        JOptionPane.showMessageDialog(null,"Tu peso ideal es " + pesonIdeal);
    }
}
