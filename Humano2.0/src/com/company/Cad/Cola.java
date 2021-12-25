package com.company.Cad;

public class Cola {
    Humano inicio;
    Humano ultimo;
    String primero = "soy el primero";

    public Cola(){
        inicio=null;
        ultimo=null;
    }

    public void cola_personas(Humano humano){  //engarzar para el profe
        if (inicio == null){
            inicio = humano;
            ultimo = humano;
        }
        else {
            ultimo.siguiente = humano;
            humano.anterior = ultimo;
            ultimo = humano;

        }
    }

    public void cerrarCola(){
        inicio.anterior = ultimo;
        ultimo.siguiente = inicio;

    }

    public  void finalizarCola(){
        Humano tmb = inicio;
        while (tmb !=ultimo){
            System.out.println(tmb.getNombre()+" Atras se encuentra " +tmb.siguiente.getNombre());
            tmb=tmb.siguiente;
        }
        System.out.println(tmb.getNombre() + " Es el ultimo");
    }


    public void Cortarcadena (Humano humano) { // no sirve :c
        if( humano == humano) {
            humano.siguiente = inicio;
            inicio = ultimo;
            ultimo = humano;
        }
        Humano tmb = humano.siguiente;
        while (tmb !=ultimo){
            System.out.println(tmb.getNombre()+" Atras se encuentra " +tmb.siguiente.getNombre());
            tmb=tmb.siguiente;
        }
        System.out.println(tmb.getNombre() + " Es el ultimo");
        }
}


