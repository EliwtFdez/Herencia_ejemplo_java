package com.company;

public class Cuentas_ahorro extends Cuenta {

    private double variable;
    private double salarioMin;



    public Cuentas_ahorro(long numerocuenta, double saldo, Persona cliente, double variable, double salarioMin){
        super(numerocuenta,saldo,cliente);
        this.variable=variable;
        this.salarioMin=salarioMin;
    }

    public void retirar(double importe) { //el saldo k nesesitamos retitrar
        double aux = 0;
        aux = saldo - importe; //el saldo menos el retiro
        if (aux >= salarioMin) {  //si es mayor o igual k el saralio entonces:
            saldo = saldo - importe;        //se resta el saldo actual y lo imprime

            System.out.println("Importe retirado: " + saldo + " $");
        } else
            System.out.println("Importe  a  retirar:  " + importe + " $\nNo  se puede realizar la operacion");

    }


    public void cambiarInteres(double vble){
        System.out.println("Nuevo interes: "+vble);
    this.variable = vble;
    vble = variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }


    public void actualizarsaldo(double retirar){
        setSaldo(retirar);
    }


    public String toString() {
        return"Nº Cuenta: "+numerocuenta+ "Saldo: "+(saldo)+" $  Interes variable anual: "+ variable+"%Saldo minimo exigido: "+salarioMin+" pesos";
    }




    public double getVariable() {
        return variable;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(double salarioMin) {
        this.salarioMin = salarioMin;
    }

    @Override
    public void retirar(double dinero) {

    }
}
