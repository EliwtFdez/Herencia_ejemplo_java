package com.company;

public class LibroEdit {
    public String identificador_libreta = "";
    private int numero_de_hojas = 100;
    private String anotar_una_cosa= "escribiendo...";
    private String color_de_libreta = "";
    private String espiral_o_cosida = "";
    private String rayas_o_cuadros = "";
    private int cantidad_de_hojas= 0;
    private int hojas_ocupadas= 0 ;
    private String abrir= "";
    private String cerrar= "";

    public LibroEdit(String nombre, String color_de_libreta,int cantidad_de_hojas,String rayas_o_cuadros, String espiral_o_cosida){
        this.identificador_libreta = nombre;
        this.color_de_libreta = color_de_libreta;
        this.cantidad_de_hojas= cantidad_de_hojas;
        this.rayas_o_cuadros = rayas_o_cuadros;
        this.espiral_o_cosida= espiral_o_cosida;
    }

    public void setanotar_una_cosa(String anotar_una_cosa){
        this.anotar_una_cosa = anotar_una_cosa ;
    }

    public void setHojas_ocupadas(int hojas_ocupadas){
        this.hojas_ocupadas =hojas_ocupadas;
    }

    public void setAbrir(String abrir){
    this.abrir= abrir;
    }

    public void setCerrar(String cerrar) {
        this.cerrar = cerrar;
    }

    public int getCantidad_de_hojas() {
        return this.cantidad_de_hojas=cantidad_de_hojas;
    }
}
