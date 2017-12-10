/*
Dado un array de string se dira  la cadena con mayor longitud

 */

package com.cice.ejercicios;

public class Ejercicio01 {
    public static void main(String[] args ){

        String[] cadenas= {"esto es","aun mas largo y es la mas larga larga","menos largo","quien sabe lo que es"};
        int longitud = 0;
        String cadena = "";

        for (int i = 0; i < cadenas.length;i++){

            if (cadenas[i].length()>longitud){
                longitud = cadenas[i].length();
                cadena = cadenas[i];
            }
        }

        System.out.println(longitud);
        System.out.println(cadena);

    }
}
