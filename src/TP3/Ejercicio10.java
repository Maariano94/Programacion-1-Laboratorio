package TP3;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número de DNI (sin la letra): ");
        int numeroDNI = scanner.nextInt();

        char letraDNI = obtenerLetra(numeroDNI);


        System.out.println("El DNI completo es: " + numeroDNI + letraDNI);

        scanner.close();
    }

    public static char obtenerLetra(int numeroDNI) {

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


        int resto = numeroDNI % 23;


        return letras[resto];
    }
}