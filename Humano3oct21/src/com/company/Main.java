package com.company;

import com.company.Cad.Cola;
import com.company.Cad.Humano;

public class Main {

    public static void main(String[] args) {

      Cola colahumanos  =new Cola();

     Humano h1 = new Humano("angel");
        colahumanos.agregarHumano(h1);
        
     Humano h2 = new Humano("Cristy");
        colahumanos.agregarHumano(h2);

     Humano h3 = new Humano("Filipo");
        colahumanos.agregarHumano(h3);

     Humano h4 = new Humano("Onichan");
        colahumanos.agregarHumano(h4);

     Humano h5 = new Humano("Arturo");
        colahumanos.agregarHumano(h5);

        colahumanos.imprimirCola();    //se imprimio todo lo anterior


        colahumanos.removerCliente();  //se elimina 1
        colahumanos.imprimirCola();    //se imprimio todo lo anterior menos el que se elimino anterior

        //se repite la misma forma de eliminar

        colahumanos.removerCliente();
        colahumanos.imprimirCola();

    }
}