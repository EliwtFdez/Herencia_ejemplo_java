package com.company;

public class Main {

    public static void main(String[] args) {
	LibroEdit milibreta = new LibroEdit("ELIW", "aZUL", 500,"cuadros","espiral");

    milibreta.setanotar_una_cosa("anotando...");
    milibreta.setHojas_ocupadas(30);
    milibreta.setAbrir("se abrio la libreta");
    milibreta.setCerrar("se cerro");

    milibreta.getCantidad_de_hojas();
        //System.out.println(+milibreta.getCantidad_de_hojas());


    }
}
