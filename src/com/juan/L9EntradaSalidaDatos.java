package com.juan;

import java.util.Scanner;

public class L9EntradaSalidaDatos {
    public static void main(String[] args) {
        // IGU: interfaz gráfica de usuario
        // Scanner: Permite introducir info utilizando la consola del sistema
        // netLine() nextInt() nextDouble()
        // no son estático
        // Lo métodos que no son estáticos implican que
        // o exigen que utilices un objeto de la clase Scanner
        // delante del método

        // JOptionPane: Construir ventanas de cuadros de texto
        // showInputDialog() : es un método estático
        // que un método sea estático implica que delante de él
        // hay que poner el nomnbre de la clase

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor");
        String nombreUsusario = entrada.nextLine();
        System.out.println("Introduce la edad, por favor");
        int edadUsuario = entrada.nextInt();
        System.out.println("Hola " + nombreUsusario + ", tu edad es " + edadUsuario );
        System.out.println("El año entrante cumples " + (edadUsuario+1) + " años");

    }
}
