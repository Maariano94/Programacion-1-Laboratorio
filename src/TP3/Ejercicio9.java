package TP3;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de números separados por guiones medios:");
        String cadena = scanner.nextLine();


        String[] numerosComoCadenas = cadena.split("-");
        int[] numeros = new int[numerosComoCadenas.length];

        for (int i = 0; i < numerosComoCadenas.length; i++) {
            numeros[i] = Integer.parseInt(numerosComoCadenas[i]);
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Suma total de los elementos: " + suma);
        System.out.println("Valor promedio de los elementos: " + promedio);
    }
}