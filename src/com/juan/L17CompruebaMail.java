package com.juan;

import javax.swing.*;

public class L17CompruebaMail {
    public static void main(String[] args) {
        int contadorArroba = 0;
        boolean punto = false;
        String email = JOptionPane.showInputDialog("Introduce email");
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i)== '@') {
                contadorArroba++;
            }
            if(email.charAt(i) == '.'){
                punto = true;
            }
        }
        if(contadorArroba == 1  && punto == true){
            System.out.println("El email es correcto");
        } else {
            System.out.println("El email es incorrecto");
        }
    }
}
