package com.company;

public class Gelly {
    //atributos
    private String tamaño = "mediano", color = "rojo", sabor = "fresa";

    //constructores
    public Gelly (){
        System.out.println(tamaño+" "+color+" "+sabor);
    }

    public Gelly (String tamaño, String color, String sabor){
        this.tamaño = tamaño;
        this.color = color;
        this.sabor = sabor;
        System.out.println(tamaño+" "+color+" "+sabor);
    }

}
