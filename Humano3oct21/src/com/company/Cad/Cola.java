package com.company.Cad;

public class Cola {
    private Humano primero;
    private Humano ultimo;

    public Cola(){
        primero=null;
        ultimo=null;
    }

    public void agregarHumano(Humano cliente){
        if (primero == null){
            primero=cliente;
            ultimo=cliente;
        }
        else {
            ultimo.setAnterior(cliente);
            cliente.setSiguiente(ultimo);
            ultimo = cliente;
        }
    }

    public void removerCliente(){
        if (primero == null){
            System.out.println("LA COLA ESTA VACIA");
        }
        else if (primero == ultimo){
            primero=null;
            ultimo=null;
        }
        else{
            primero=primero.getAnterior();
            primero.setSiguiente(null);
        }
    }

    public void imprimirCola(){
        System.out.println();
        if (primero == null){
            System.out.println("LA COLA ESTA VACIA");
        }
        else{
            Humano conta = primero;
            int posicion = 1;
            while (conta != null){
                System.out.println("El que esta en la posicion " + posicion + " es " + conta.getNombre());
                conta = conta.getAnterior();
                posicion++;
            }
        }
    }
}
