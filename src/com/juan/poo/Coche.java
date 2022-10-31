package com.juan.poo; // Primero va package y luego los import

import java.util.Locale;

public class Coche {
    // Para evitar que se pueda modificar la información del constructor desde
    // una clase exterior, hay que usar un modificador de acceso.
    // public, private, protected, etc
    // Las siguientes propiedades son constantes para todos los coches
    private int ruedas; // Con private no se puede acceder ni modificar la propiedad desde fuera
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;

    // Las Siguientes propiedades pueden variar entre cada coche
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    // Metodo constructor: da estado inicial a nuestro objeto
    // Siempre tiene el mismo nombre de la clase
    public Coche(){
        // Las siguientes son todas las propiedades que son contantes en todos
        // los coches
        ruedas = 4;
        largo = 250;
        ancho = 180;
        pesoPlataforma = 500;
        motor = 1600;
    }
    // Getters: acceder a las propiedades de los objetos
    public String getMotor(){ // Sintaxis
        return "El motor es de " + this.motor + " cc";
    }
    public String getColor(){
        return "El color del carro es " + this.color;
    }
    public String getData(){
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
                ". Mide " + largo/100 + " metros con un ancho de " +
                ancho + " cm y un peso de plataforma de " + pesoPlataforma +
                " kg";
    }
    public String getAsientosCuero(){
        if(asientosCuero==true){
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }
    public String getClimatizador() {
        if(climatizador == true){
            return "El coche tiene climatizador";
        } else {
            return "El coche no tiene climatizador";
        }
    }
    // Setters: modificar las propiedades de los objetos
    public void setColor(String color){
        this.color = color;
    }
    public void setAsientosCuero(String asientosCuero){
        if(asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero = true;
        } else if(asientosCuero.equalsIgnoreCase("no")){
            this.asientosCuero = false;
        } else {
            System.out.println("Dato incorrecto");
        }
    }
    public void setClimatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
}

