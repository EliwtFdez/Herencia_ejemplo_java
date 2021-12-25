package com.company;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //excepciones verificadas & No verificadas

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Ingrese un numero");
            numero = s.nextInt();
            System.out.println("El número es " + numero);
        } catch (InputMismatchException ex) {
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros");

        } catch (Exception X) {
            System.out.println("Programa finalizado");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}