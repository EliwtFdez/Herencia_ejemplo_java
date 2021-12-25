class Mensaje {
  
    private String titulo;
  private String texto;

  public Mensaje(){}

  public Mensaje(String titulo, String txt){
    this.titulo=titulo;
    this.texto=txt;
  }

  public void setTitulo(String titulo){
    this.titulo=titulo;
  }

  public void setTexto(String texto){
    this.texto=texto;
  }

  public String getTitulo(){return this.titulo;}

  public String getTexto(){return this.texto;}

}