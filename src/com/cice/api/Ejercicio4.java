package com.cice.api;

public class Ejercicio4 {

    public static void main (String[] args){

        StringBuilder stb = new StringBuilder("Cadena de prueba modificable");

        /*int num = 340;
        stb.append(num);
        System.out.println(stb.toString());
        stb.delete(5,8);
        System.out.println(stb);
        stb.insert(10,"Real Madrid");
        System.out.println(stb);
        stb.replace(10,13,"*Otra cadena*");
        System.out.println(stb);
        System.out.println(stb.indexOf("Madrid"));
        */

        StringBuilder text = new StringBuilder("La cadena que se debe separar con barras");
        System.out.println(text);
        int i = 0;
        while (text.indexOf(" ", i) != -1 ){
            System.out.println("Posicion :" + i);
            text.insert(text.indexOf(" ", i ),"/");
            i = text.indexOf(" ", i ) +1;
        }
        System.out.println(text);

        double numA = 0;
        double numB = 0;
        double suma = 0;

        numA = Math.random()*100;
        numB = Math.random()*100;

        numA = Math.round(numA);
        numB = Math.round(numB);

        System.out.println("numA: " + numA);
        System.out.println("numB: " + numB);

        if (numA > numB) {
            for (int j = (int) numB ; j <= numA ; j++){
                suma+=j;
                }

            }
        else  {
            for (int j = (int) numA ; j <= numB ; j++){
                suma+=j;
            }

        }
        System.out.println("La suma es: " + suma);

        String numero = "334353553";
        int n = Integer.parseInt(numero);
        System.out.println("Incrementado: " + (++n));
    }
}






