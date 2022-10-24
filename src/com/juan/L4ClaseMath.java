package com.juan;

public class L4ClaseMath {
    public static void main(String[] args) {
        // Las clases en java pueden ser de dos tipo
        // propias y predefinidas: String, Math, Array, Thread... cientos y cientos
        // API Java: Biblioteca de clases: Consultar clases y métodos
        double raiz = Math.sqrt(9);
        System.out.print(raiz);
        double num1=5.54;
        int resultado = (int)Math.round(num1); // Bota error porque Math.round devuleve un long, pero si num1 fuera un float, ahí sí podría retornar un entero
        // refundión: convertir un tipo de dato en otro.
        // Se hizo poniendo el tipo de dato entre paréntesis, así:
        // (int) antes del método
        // Pero hay que tener cuidado ya que puede haber
        // pérdida de información




    }
}
