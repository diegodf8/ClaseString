package com.cice.ejercicios;

public class Ejercicio2 {
    public static void main(String[] args){

        String cadena = "Esto es una cadena con informacion";
        int cont  = 0;
        cadena = cadena.toLowerCase();

        for(int i = 0; i< cadena.length(); i++){

            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'){
                cont++;
            }

        }

        System.out.println(cont);
    }
}
