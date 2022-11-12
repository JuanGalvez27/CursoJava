package com.juan.persona;

import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {

    class Empleado{
        public Empleado(double sue, int year, int mes, int dia){
            sueldo = sue;
            GregorianCalendar calendario = new GregorianCalendar(year, mes-1, dia);
            altaContrato = calendario.getTime();
        }
        public Empleado() {
            this(30000, 2000, 01, 01);
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
}
