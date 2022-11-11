package com.juan.empleado;

// Si vamos a hacer varias clases en un solo archivo, sólo una de las clases
// Puede ser public, al igual que sólo una debe tener el método main

import java.util.*;


public class UsoEmpleado {
    public static void main(String[] args) {
/*        Empleado empleado1 = new Empleado("Juan Galvez", 4000000, 2022, 11, 11);
        Empleado empleado2 = new Empleado("Ana Lopez", 5000000, 2022, 22, 8);
        Empleado empleado3 = new Empleado("María Marín", 3600000, 2021,19, 12);
        empleado1.subirSueldo(5);
        empleado2.subirSueldo(5);
        empleado3.subirSueldo(5);
        System.out.println("Nombre: " +empleado1.getNombre() + " Sueldo: " +
                empleado1.getSueldo() + " Fecha de alta: " + empleado1.getAltaContrato());
        System.out.println("Nombre: " +empleado2.getNombre() + " Sueldo: " +
                empleado2.getSueldo() + " Fecha de alta: " + empleado2.getAltaContrato());
        System.out.println("Nombre: " +empleado3.getNombre() + " Sueldo: " +
                empleado3.getSueldo() + " Fecha de alta: " + empleado3.getAltaContrato());*/

        Jefatura jefeRRHH = new Jefatura("Juan", 5500000, 2006, 5, 25);
        jefeRRHH.setIncentivo(700000);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Juan Galvez", 4000000, 2022, 11, 11);
        misEmpleados[1] = new Empleado("Ana Lopez", 5000000, 2022, 22, 8);
        misEmpleados[2] = new Empleado("María Marín", 3600000, 2021,19, 12);
        misEmpleados[3] = new Empleado("Juan Fernando");
        misEmpleados[4] = jefeRRHH; // Polimorfismo. Principio de sustitucion
        misEmpleados[5] = new Jefatura("Melisa", 9000000, 2004, 10, 14);

        // Hacemos un cast al objeto, ahora no es un array tipo Empleado, sino tipo
        // Jefatura, por esto, ya se puede acceder a los métodos de la clase Jefatura

        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];

        jefaFinanzas.setIncentivo(500000);

        // Casting sin sentido: no sigue la regla Es un...
        // Jefatura jefeCompras = (Jefatura) misEmpleados[1];

        /*for(int i = 0; i< misEmpleados.length; i++){
            misEmpleados[i].subirSueldo(5);
        }*/
        for(Empleado e: misEmpleados){
            e.subirSueldo(5);
        }
        for(Empleado e:misEmpleados){

            System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de alta: " + e.getAltaContrato());
        }
//        for(int i = 0; i< misEmpleados.length; i++){
//            System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: " + misEmpleados[i].getSueldo() + " Fecha de alta: " +misEmpleados[i].getAltaContrato());
//        }
    }
}

class Empleado{
    public Empleado(String nom, double sue, int year, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        // class GregorianCalendar: construye una fecha
        GregorianCalendar calendario = new GregorianCalendar(year, mes-1, dia);
        altaContrato = calendario.getTime();
    }
    // Crear varias constructores dentro de la misma clase
    // me sirve para darle diferentes inciciaciones a
    // mis objetos creados.
    // Se tomará el constructor dependiendo de la cantidad
    // de argumentos que se le indique en la instancia.
    public Empleado(String nom){
        this(nom, 30000, 2000,01,01);
        // Al hacer ésto lo que hacemos es llamar al
        // otro constructor de la misma clase y darle
        // los argumentos mediante éste.
    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    // Getters

    public String getNombre(){
        return nombre;
    }
    // También puedo agregar final a los metodos para bloquearlos
    // de ésta manera, las clases hijas no pueden usar los métodos de la
    // clase padre. Mostraría error en la clase jefatura ya que el getSueldo
    // de esa clase, toma el valor inicial del getSueldo de la clase Empleado

    // Si llamamos en la clase Jefatura getSueldo2, ya sí podrá ser usada
    //public double getSueldo(){
     //   return sueldo;
    //}
    public double getSueldo(){
        return sueldo;
    }
    public Date getAltaContrato(){
        return altaContrato;
    }

    // Setters
    public void subirSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
            sueldo+=aumento;
    }
}

/**
 *  Diseño de herencia:
 *  hacerse la pregunta: ¿...es un...?
 *  para saber qué clase hereda a cuál, así:
 *  el objeto Jefe sí va a ser un Empleado
 *  pero un empleado no necesariamente va a ser un jefe
 */
// final detiene la cadena de la herencia en la clase Jefatura
// final class Jefatura extends Empleado {
class Jefatura extends Empleado {
    private double incentivo;

    public Jefatura(String nom, double sue, int year, int mes, int dia){
        super(nom, sue, year, mes, dia);

    }

    public void setIncentivo(double b){
        incentivo = b;
    }

    //Sobreescribimos el getSueldo de la clase empleado
    public double getSueldo(){
        // Super indica que es el getter pertenece a la clase padre
        double sueldoJefe = super.getSueldo();
        return sueldoJefe+incentivo;
    }
}

class Director extends Jefatura{

    public Director(String nom, double sue, int year, int mes, int dia){
        super(nom, sue, year, mes, dia);
    }
}

/**
 * Polimorfismo: relacionado con el principio de sustitucion
 * podemos utilizar un objeto de una subclase  siempre que eñ
 * programa espere un objeto de la superclase
 * las varibles objeto son polimorficas
 *
 * Una variable de tipo objeto se comporta de una manera
 * dependiendo del contexto.
 * Dependiendo la clase en que es ocupada
 * ésto lo hace la mquina virtual de java automáticamente, y se llama:
 * enlazado dinámico. JDK detecta si pertenece a la clase padre o a la clase hija
 */

// Refundicion y casting es lo mismoE
// Convertir un objeto a otro tipo de objeto diferente

/**
 * Cuando la clase es final, se detiene la cadena de la herencia
 */

/**
 * Clases abstrctas:
 * En una jerarquia de herencia, la subclase que esta mas abajo,
 * es la mas especializada, porque, en el ejemplo, jefatura hereda los metodos
 * de empleado y de jefe, ademas de los suyos propios
 * entre mas arriba en la jerarquia, las clases son mas abstractas
 *
 * metodo abstracto se crea:
 * public abstract String getDescripcion();
 * no lleva llaves, solamente se define
 * cuando una clase tiene un metodo abstracto, la clase tabien debe ser abstracta
 * como regla de sintaxis
 *
 * clase abstracta:
 * abstract class Persona { constructor, metodos, etc...};
 * cuando se tiene una clase abstracta hay que seguir un patron en la
 * jerarquia de mi herencia
 *
 * enseguida, todas las clases que hereden de la clase abstracta, estan
 * obligadas a sobreescribir los metodos de la clase padre
 *
 * esto en cada una de las clases
 * lasclases abstractas obligan a crear un patron de diseño que se debe
 * seguir en la jerarquia de herencia
 *
 */