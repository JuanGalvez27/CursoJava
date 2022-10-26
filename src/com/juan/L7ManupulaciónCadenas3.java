package com.juan;

public class L7ManupulaciónCadenas3 {
    public static void main(String[] args) {
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equals(alumno2));
        // Distingue mayusculas de minusculas
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
