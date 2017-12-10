package com.cice.api;

public class MiString {

    public static void main (String[] args){

        String cadena = new String(" cadena de prueba mi otra vez mi   ");
        double aux;

        int tam = cadena.length();
        System.out.println(tam);

        System.out.println(cadena.charAt(3));

        System.out.println(cadena.indexOf("mi"));
        System.out.println(cadena.indexOf("mi", 8));
        System.out.println(cadena.lastIndexOf("mi"));
        System.out.println(cadena.lastIndexOf("mi",31));

        System.out.println(cadena.substring(0,25));

        String[] arr = cadena.split(" "); //corta la cadena por el caracter que le pasamos
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println(cadena);
        System.out.println(cadena.trim()); //elimina espacios en blanco al principio y al final

        System.out.println(cadena.replace("mi", "tu"));

        String cadena2 = String.valueOf(4.5345345); //convierte un primitivo a un string
        System.out.println(cadena2);

        aux = Double.parseDouble(cadena2);  //convierte un string a un primitivo, son parseos o clases de envoltura



    }

}
