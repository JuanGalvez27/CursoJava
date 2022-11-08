package com.juan.pruebas;

public class Pruebas {
    public static void main(String[] args) {
        Empleado trabajador1 = new Empleado("Marciano");
        Empleado trabajador2 = new Empleado("Ana");
        Empleado trabajador3 = new Empleado("Antonio");
        trabajador1.cambiarSeccion("Desarrollo");
        System.out.println(trabajador1.getData() + "\n" +trabajador2.getData() + "\n" +
            trabajador3.getData());
        System.out.println(Empleado.getNextId());
    }
}

class Empleado{
    private final String nombre;
    private String seccion;
    private  int id;
    private static int idSiguiente=1;
    public Empleado(String nom){
        nombre = nom;
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }

    // Getters
    public String getData(){
        return "Nombre: " + nombre + ". Seccion: " + seccion + ". ID:" + id;
    }
    // Setters
    public void cambiarSeccion(String seccion){
        this.seccion = seccion;
    }
    public static String getNextId(){
        return "El ID siguiente es: " + idSiguiente;
    }
}

