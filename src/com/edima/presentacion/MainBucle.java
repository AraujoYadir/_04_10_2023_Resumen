package com.edima.presentacion;

import java.util.Scanner;

public class MainBucle {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("ingreso un numero");
        int num1= s1.nextInt();
        System.out.println("ingreso otro numero");
        int num2= s1.nextInt();
        System.out.println("ingreso otro numero");
        int num3= s1.nextInt();
        int suma=num1+num2+num3;
        System.out.println("La suma es: "+suma);
        //Otro Bucle

        Scanner s2=new Scanner(System.in);
        int suma2= 0;
        for(int i=0;i<=2;i++){
            System.out.println("ingreso un numero ahora");
            int numero= s2.nextInt();
            suma2=suma2+numero;
        }
        System.out.println(suma2);

                for(int i=100; i>=0; i--) {
                    System.out.println(i + ",");
                }


                int numero3=s2.nextInt();
                for(int i=0;i<=10;i++){
                    System.out.println(numero3 + "x" + i + "=" + (numero3*i));
                }




        }
    }
