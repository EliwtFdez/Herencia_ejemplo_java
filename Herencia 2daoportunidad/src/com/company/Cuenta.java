package com.company;

public abstract class Cuenta  {
   protected long numerocuenta;
   protected double saldo;
    Persona cliente;
    Double dr;


    public Cuenta (){}

    public Cuenta(long numCuenta,double saldo,Persona cliente){
        this.numerocuenta=numCuenta;

        this.saldo=saldo;

        this.cliente=cliente;
    }


    public void ingresar(double dr){
        saldo=saldo+dr;
        System.out.println("Importe ingresado: "+saldo+"pesos");
    }



    public  abstract void retirar (double dinero);


    public abstract void actualizarsaldo(double retirar);



    // para ver la cuenta corriente
    public void verSaldoCuentaCorriente(){
        saldo+=saldo*1.5/100; //el saldo que tenemos * 1.5 de int fijo entre 100
        System.out.println("Saldo actual: "+saldo+" pesos");
    }



    // para ver la cuenta ahorro
    public void verSaldoCuentaAhorro(double vble){
        saldo+=saldo*vble/100;
        System.out.println("Saldo actual: "+saldo+" $");     }







    public long getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(long numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Double getDr() {
        return dr;
    }

    public void setDr(Double dr) {
        this.dr = dr;
    }


}
