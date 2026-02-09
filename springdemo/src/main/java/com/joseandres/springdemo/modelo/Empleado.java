package com.joseandres.springdemo.modelo;

public class Empleado {
    private String nombre_completo;
    private String dni;

    public Empleado(String dni, String nombre_completo) {
        this.dni = dni;
        this.nombre_completo = nombre_completo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
