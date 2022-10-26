package com.juan;

import javax.swing.*;
import java.util.Scanner;

public class L13CondicionalSwitch {
    public static void main(String[] args) {
        // Crearemos un programa que nos dé las áreas de:
        // Cuadrado
        // rectángulo
        // triángulo
        // círcuño
        // Consola para que el usuario diga la forma
        // JOptionPane para pedir la magnitud de los lados o radio

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la forma de la que desea obtener el área");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. triangulo");
        System.out.println("4. Circulo");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1:{
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de los lados"));
                int areaCuadrado = lado*lado;
                JOptionPane.showMessageDialog(null, "El área del cuadrado es " + areaCuadrado );
                break;
            }
            case 2:{
                int baseRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la base"));
                int alturaRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la altura"));
                int areaRectangulo = baseRectangulo*alturaRectangulo;
                JOptionPane.showMessageDialog(null, "El área del rectángulo es " + areaRectangulo);
                break;
            }
            case 3: {
                int baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la base"));
                int alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la altura"));
                double areaTriangulo = baseTriangulo*alturaTriangulo*0.5;
                JOptionPane.showMessageDialog(null, "El area del triangulo es: " + areaTriangulo);
                break;
            }
            case 4: {
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor del radio"));
                double areaCirculo= Math.PI * Math.pow(radio, 2);
                JOptionPane.showMessageDialog(null, "El area del circulo es" + areaCirculo  );
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "Opción inadecuada");
            }
        }
    }
}
