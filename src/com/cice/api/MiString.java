package com.cice.api;

public class MiString {

    public static void main (String[] args){

        String cadena = new String("cadena de prueba mi otra vez mi");

        int tam = cadena.length();
        System.out.println(tam);

        System.out.println(cadena.charAt(3));

        System.out.println(cadena.indexOf("mi"));
        System.out.println(cadena.indexOf("mi", 8));
        System.out.println(cadena.lastIndexOf("mi"));
        System.out.println(cadena.lastIndexOf("mi",31));

        System.out.println(cadena.substring(0,25));
    }
}
