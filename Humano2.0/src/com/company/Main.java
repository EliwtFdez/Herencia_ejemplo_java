package com.company;

import com.company.Cad.Cola;
import com.company.Cad.Humano;

public class Main {

    public static void main(String[] args) {
        Cola human = new Cola();
        Humano h1 = new Humano("Juan");
        human.cola_personas(h1);
        Humano h2 = new Humano("Carlos");
        human.cola_personas(h2);
        Humano h3 = new Humano("Onichan");
        human.cola_personas(h3);
        Humano h4 = new Humano("Filipo");
        human.cola_personas(h4);
        Humano h5 = new Humano("Cristy");
        human.cola_personas(h5);
        Humano h6 = new Humano("Angel");
        human.cola_personas(h6);

      //====================
        human.cerrarCola();
        human.finalizarCola();
        System.out.println("======================= Next cola 1 cortacadena ===================");
        human.Cortarcadena(h2);
      //=====================
        System.out.println("======================= Next ===================");

        Cola cola2 = new Cola();
        for (int i=0; i<5; i++){
            if (i%1==0){
                cola2.cola_personas(new Humano("prueba nombre x "));
                }
            }

        cola2.finalizarCola();
        }
}

