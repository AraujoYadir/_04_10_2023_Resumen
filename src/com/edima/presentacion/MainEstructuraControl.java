package com.edima.presentacion;
import java.util.Scanner;
import java.lang.String;

public class MainEstructuraControl {
    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 9999");
        int numero = teclado1.nextInt();
        if(numero >= 0 && numero <= 9999) {
            if(numero < 10) {
                System.out.println("El numero tiene una cifra");
            } else if (numero < 100) {
                System.out.println("El numero tiene dos cifras");
            }else if (numero < 1000) {
                System.out.println("El número tiene tres cifra");
            }else{
                System.out.println("El número tiene cuatro cifra");
            }
        }else {
            System.out.println("Valor inválido");
        }


        }
}



