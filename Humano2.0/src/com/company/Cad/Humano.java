package com.company.Cad;

public class Humano {
    private String nombre;
    Humano anterior;
    Humano siguiente;

    public Humano (String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
