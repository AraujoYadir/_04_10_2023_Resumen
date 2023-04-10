package com.edima.presentacion;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Variables Primitivas
        float precio =10.5f;
        System.out.println("El precio del producto es: "+ precio);
        char estado = 'z';
        System.out.println("Variable de tipo char: "+ estado);
        long val = 12345681l;
        System.out.println("Variable de tipo long: "+ val);
        float val2 = 34_005.87f;
        System.out.println("Variable de tipo float: "+ val2);
        //Variables de tipo referencia
        String hoy="hoy es lunes de pascua";
        System.out.println(hoy);
        System.out.println(hoy.toUpperCase());
        System.out.println("("+hoy.substring(7,12)+")");
        System.out.println(hoy.indexOf("lunes"));
        System.out.println(hoy.indexOf("lunes")+"lunes".length());
        System.out.println("("+hoy.substring(hoy.indexOf("lunes"),hoy.indexOf("lunes")+"lunes".length())+")");

        Scanner s1= new Scanner(System.in);
        System.out.println("Escriba su edad ->");
        int edad = s1.nextInt();

       // System.out.println("Escriba su profesion ->");
        int profesion = s1.nextInt();

        // Variables de referencia para fechas
        LocalDate fNacimiento = LocalDate.of(1992, 8, 30);
        System.out.println("Fechas de Nacimineto" + fNacimiento);
        System.out.println(fNacimiento.plusYears(1));



    }

}