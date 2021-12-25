package com.company;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divicion_Main {
    //Solucion a los numeros divididos entre "0"
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Calcular_divicion x = new Calcular_divicion();
    //variables:
        int num1 = 0,num2 = 0;

      //  JOptionPane.showMessageDialog(null,"el resultado es"+x.Calcular_divicion(num1,num2));

    // Cuando ponemos 0 o letra:
        try {
            System.out.println("Ingrese un numero para dividir");
            num1 = teclado.nextInt();
            System.out.println("Ingrese otro numero para dividir");
            num2 = teclado.nextInt();
            System.out.println("El resultado de la división es " + x.Calcular_divicion(num1, num2));
        }
        catch (Exception c){
            JOptionPane.showMessageDialog(null,"No puedes");
        }

        /*
        } catch (InputMismatchException a) {
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros");
        }catch(ArithmeticException b){
            JOptionPane.showMessageDialog(null,"No se puede dividir entre cero");
        }catch (Exception c){
            JOptionPane.showMessageDialog(null,"No puedees ingresar letras");
        }finally {
            System.out.println("Finally program");
        }

         */

    }
}


class Calcular_divicion{
    public int Calcular_divicion(int numero1,int numero2) throws ArithmeticException, Exception{
        int resultado= 0;
        resultado = numero1/numero2;
        return resultado;
    }


}