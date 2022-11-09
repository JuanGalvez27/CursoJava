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

        Jefatura jefeRRHH = new Jefatura("Juan", 5500000, 1006, 5, 25);
        jefeRRHH.setIncentivo(700000);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Juan Galvez", 4000000, 2022, 11, 11);
        misEmpleados[1] = new Empleado("Ana Lopez", 5000000, 2022, 22, 8);
        misEmpleados[2] = new Empleado("María Marín", 3600000, 2021,19, 12);
        misEmpleados[3] = new Empleado("Juan Fernando");
        misEmpleados[4] = jefeRRHH; // Polimorfismo. Principio de sustitucion
        misEmpleados[5] = new Jefatura("Maria", 9000000, 2004, 10, 14);

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

/**
 * Polimorfismo: relacionado con el principio de sustitucion
 * podemos utilizar un objeto de una subclase  siempre que eñ
 * programa espere un objeto de la superclase
 * las varibles objeto son polimorficas
 */
