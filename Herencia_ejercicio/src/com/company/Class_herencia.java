package com.company;

class Auto_herencia_plantilla {
 private String matricula ;
 private String modelo_auto;
 private String color;
 private int numero_de_puertas;

 public Auto_herencia_plantilla (){}

 public Auto_herencia_plantilla (String matricula, String modelo_auto, String color, int numero_de_puertas){
     this.color = color;
     this.matricula = matricula;
     this.modelo_auto = modelo_auto;
     this.numero_de_puertas = numero_de_puertas;
 }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo_auto(String modelo_auto) {
        this.modelo_auto = modelo_auto;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumero_de_puertas(int numero_de_puertas) {
        this.numero_de_puertas = numero_de_puertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo_auto() {
        return modelo_auto;
    }

    public String getColor() {
        return color;
    }

    public int getNumero_de_puertas() {
        return numero_de_puertas;
    }

    @Override
    public String toString() {
        return "Auto_herencia_plantilla{" +
                "matricula='" + matricula + '\'' +
                ", modelo_auto='" + modelo_auto + '\'' +
                ", color='" + color + '\'' +
                ", numero_de_puertas=" + numero_de_puertas +
                '}';
    }
}

//===============clase con herencia=================

class Auto extends Auto_herencia_plantilla {
private String turbo;
private String nitro;

    public Auto (String matricula, String modelo_auto, String color, int numero_de_puertas,String turbo, String nitro) {
        super(matricula, modelo_auto, color, numero_de_puertas);
        this.nitro = nitro;
        this.turbo = turbo;
    }

    public void setNitro(String nitro) {
        this.nitro = nitro;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    public String getNitro() {
        return nitro;
    }

    public String getTurbo() {
        return turbo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "turbo='" + turbo + '\'' +
                ", nitro='" + nitro + '\'' +
                super.toString()+ '}';
    }
    
}