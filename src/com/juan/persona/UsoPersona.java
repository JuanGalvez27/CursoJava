package com.juan.persona;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
    public static void main(String[] args) {
    Persona[] lasPersonas = new Persona[2];
    lasPersonas[0] = new Empleado("Juan", 4000000, 2022, 11, 20);
    lasPersonas[1] = new Alumno("Juan", "Software Development");
    for(Persona p: lasPersonas){
        System.out.println(p.getNombre());
        System.out.println(p.getDescription());
    }
    }
}

abstract class Persona {
    public Persona(String nom) {
        nombre = nom;
    }

    private String nombre;

    String getNombre() {
        return this.nombre;
    }

    /**
     *Se toma como patrón o pauta para  la jerarquia de la herencia
     */
    public abstract String getDescription();
}

class Empleado extends Persona{
    public Empleado(String nom, double sue, int year, int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(year, mes-1, dia);
        altaContrato = calendario.getTime();
    }
    public String getDescription(){
        return "Empleado: " + sueldo;
    }

    private double sueldo;
    private Date altaContrato;

    // Getters

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

class Alumno extends Persona{
    public Alumno(String nom, String car){
        super(nom);
        carrera = car;
    }
    private String carrera;

    public String getDescription(){
        return "Este alumno estudia: "+ carrera;
    }
}