package com.juan;

public class L6ManipulacionCadenas2 {
    public static void main(String[] args) {
        String frase = "Hoy es un estupendo día para programar en Java";
        String fraseResumen = frase.substring(1, 3) + " irnos a la ´playa";
        System.out.println(fraseResumen);
    }
}
