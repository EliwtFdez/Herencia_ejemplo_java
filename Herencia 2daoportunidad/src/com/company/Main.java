package com.company;

public class Main {

    public static void main(String[] args) {

     Cuenta_corriente objeto = new Cuenta_corriente(1234567890,20000, new Persona("carlos","Muñoz","2adf3radf3"));
     Persona persona=new Persona("Carlos","Muñoz","2adf3radf3");
        System.out.println(persona.toString());
        System.out.println(objeto.toString());
        objeto.retirar(600);
        objeto.verSaldoCuentaCorriente();

     Cuentas_ahorro cuentasAhorro=new Cuentas_ahorro(1234567890,20000,persona,0.5,500);
        cuentasAhorro.ingresar(400);
        objeto.retirar(300);

        System.out.println(objeto.toString());
    }
}
