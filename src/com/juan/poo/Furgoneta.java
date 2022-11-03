package com.juan.poo;

// Java no admite la herencia múltiple
// ésta clase extiende de la clase coche

public class Furgoneta extends Coche{
    private int capacidadCarga;
    private int plazasExtra;
    public Furgoneta(int plazasExtra, int capacidadCarga){
        super(); // llama al constuctor de la clase padre
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }
}
