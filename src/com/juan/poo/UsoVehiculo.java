package com.juan.poo;

import javax.swing.*;

public class UsoVehiculo {
    public static void main(String[] args) {
        Coche micoche1 = new Coche();
        micoche1.setColor("naranja");
        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        mifurgoneta1.setClimatizador("si");
        mifurgoneta1.setColor("azul");
        mifurgoneta1.setAsientosCuero("si");
        System.out.println(micoche1.getData()+ micoche1.getColor());
        System.out.println(mifurgoneta1.getData());
        System.out.println(mifurgoneta1.getDataFurgoneta());
    }
}
