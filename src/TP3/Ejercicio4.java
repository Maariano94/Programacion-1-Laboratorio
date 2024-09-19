package TP3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[20];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese un número decimal para la posición " + i + ": ");
            numeros[i] = sc.nextDouble();

        }

        double mayor = encontrarMayor(numeros);
        System.out.println("El mayor número en el arreglo es: " + mayor);

        double menor = encontrarMenor(numeros);
        System.out.println("El menor número en el arreglo es: " + menor);

        double rango = mayor - menor;
        System.out.println("El rango de los números en el arreglo es: " + rango);

        sc.close();
    }
        public static double encontrarMayor(double [] arreglo) {

            double mayor = arreglo[0];

            for (int i = 1; i < arreglo.length; i++) {

                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];

                }

            }return mayor;
        }

        public static double encontrarMenor(double [] arreglo) {

            double menor = arreglo[0];

            for (int i = 1; i < arreglo.length; i++) {

                if (arreglo[i] < menor) {
                    menor = arreglo[i];

                }



            }return menor;
        }
}
