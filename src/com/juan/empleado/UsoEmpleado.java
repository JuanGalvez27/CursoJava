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

        Empleado[] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Juan Galvez", 4000000, 2022, 11, 11);
        misEmpleados[1] = new Empleado("Ana Lopez", 5000000, 2022, 22, 8);
        misEmpleados[2] = new Empleado("María Marín", 3600000, 2021,19, 12);
        misEmpleados[3] = new Empleado("Juan Fernando");
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