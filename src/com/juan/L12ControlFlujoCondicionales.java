package com.juan;

import java.util.Scanner;

public class L12ControlFlujoCondicionales {
    public static void main(String[] args) {
        // Las estructurs de control de flujo lo que hacen
        // es modificar el flujo de ejecucion del programa
        // saltandose una parte, o repitiendo la ejecucion
        // de una porción de código
        // en java se usa:
        // Saltos: condicionales
        // Repetir: bucles

        // Para el else if, cuando se cumple una condicion como
        // verdadera, se interrumpe el flujo de ejecucion,
        // ignorando los demás condicionales
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la edad, por favor");
        int edad = entrada.nextInt();
        if(edad < 18){
            System.out.println("Eres menor de edad");
        } else if(edad<40) {
            System.out.println("Eres un adulto");
        } else if (edad < 60){
            System.out.println("Eres de la tercera edad");
        } else {
            System.out.println("Cuidate, cuchito");
        }
    }
}
