package com.company;

public class Cuenta_corriente  extends Cuenta{

    private double FIJO=1.5;

    public Cuenta_corriente(){
    super();
    }

    public Cuenta_corriente(long numerocuenta, double saldo, Persona cliente){
        super(numerocuenta, saldo, cliente);
    }

    public void retirar(double dinero){
        if(saldo>=dinero){
            saldo=saldo-dinero;
            System.out.println("Importe retirado: "+saldo+" pesos");
        }else
            System.out.println("No se puede realizar la operacion");
    }

    public void actualizarsaldo(double retirar){
        setSaldo(retirar);
    }

    @Override
    public String toString() {
        return "Cuenta_corriente{" +"numero de cuenta: " +numerocuenta+ "Saldo: "+ saldo+" Pesos + interes del:"+FIJO+ " %";

    }
}
