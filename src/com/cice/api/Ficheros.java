package com.cice.api;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.File;
import java.util.Scanner;

public class Ficheros {
    public static void main (String[] args) throws FileNotFoundException {

        File fichero = new File ("C:\\Users\\Diego_Yako\\Desktop\\Diego.txt");
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.exists());
        PrintStream ps = new PrintStream(fichero);
        ps.println("Hola Hola caacola");
        ps.close();
    }
}
