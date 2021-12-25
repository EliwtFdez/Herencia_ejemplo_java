package com.company.Cad;

public class Humano {
        private String nombre;
        private Humano siguiente;
        private Humano anterior;

        public Humano(String nombre, Humano anterior, Humano siguiente){
            this.nombre=nombre;
            this.anterior=anterior;
            this.siguiente=siguiente;
        }

        public Humano(String nombre){
            this.nombre=nombre;
            anterior=null;
            siguiente=null;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Humano getSiguiente() {
            return siguiente;
        }

    public void setSiguiente(Humano siguiente) {
        this.siguiente = siguiente;
    }

    public Humano getAnterior() {
            return anterior;
        }

        public void setAnterior(Humano anterior) {
            this.anterior = anterior;
        }

}
