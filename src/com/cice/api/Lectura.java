package com.cice.api;

import java.util.Scanner;

public class Lectura {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el dato: ");
        String dato = sc.next();
        System.out.println(dato);
        String dato2 = sc.next();
        System.out.println(dato2);
        sc.useDelimiter("p");
        String dato3 = sc.next();
        System.out.println();


    }
}
