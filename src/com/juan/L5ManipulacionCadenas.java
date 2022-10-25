package com.juan;

public class L5ManipulacionCadenas {
    public static void main(String[] args) {
        // String no es un tipo primitivo
        // String es una clase predefinida
        // Métodos más usados
        // length: longitud de la palabra
        // charAt(n): devuelve la posición un caracter dentro de la cadena
        // substring(x,y): devuelve una subcadena dentro de la cadena, siendo
        // X el carácter a partir del cual se extrae el Y el n°
        // de caratéres que e quieren extraer}
        // equals(cadena): comprueba si dos cadenas de caractere
        // son iguales o no. Tiene en cuenta maypuscula o minus
        // equalsIgnoreCase(cadena): lo anterior pero ignora case
        String nombre = "Juan";
        System.out.println(nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

    }
}
