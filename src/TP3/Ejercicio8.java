package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 dígitos enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el dígito " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] ascendente = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ascendente);

        int[] descendente = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descendente[i] = ascendente[numeros.length - 1 - i];
        }

        System.out.println("\nArreglo ordenado de forma ascendente:");
        for (int num : ascendente) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nArreglo ordenado de forma descendente:");
        for (int num : descendente) {
            System.out.print(num + " ");
        }
    }
}