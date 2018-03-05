package com.cice.api;

public class Main {

    public static void main(String[] args){

        String prueba = "Pepe Juan Edu Alvaro Diego";

        String[] aux;

        System.out.println(prueba.replace(" ","/"));

        aux= prueba.split(" ");
        System.out.println(aux[3]);

    }
}