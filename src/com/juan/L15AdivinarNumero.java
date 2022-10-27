package com.juan;

import javax.swing.*;

public class L15AdivinarNumero {
    public static void main(String[] args) {
        double numero = Math.random();
        int adivinar = (int) (numero*100);
        int adivinado = 0;
        while(adivinar != adivinado){
            adivinado = Integer.parseInt(JOptionPane.showInputDialog("¿que valor cree que es"));
            if(adivinado > adivinar){
                System.out.println("El numero es menor");
            } else if (adivinado < adivinar) {
                System.out.println("El número es mayor");
            }
        }
        System.out.println("El numero es " + adivinado);
    }
}
