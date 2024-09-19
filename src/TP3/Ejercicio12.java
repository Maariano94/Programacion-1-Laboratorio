package TP3;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Introduce el número que deseas eliminar: ");
        int numeroAEliminar = scanner.nextInt();

        int[] nuevoArreglo = eliminarNumero(numeros, numeroAEliminar);

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Nuevo arreglo sin el número " + numeroAEliminar + ": " + Arrays.toString(nuevoArreglo));

        scanner.close();
    }

    public static int[] eliminarNumero(int[] arreglo, int numero) {
        int contador = 0;
        for (int num : arreglo) {
            if (num == numero) {
                contador++;
            }
        }

        int[] nuevoArreglo = new int[arreglo.length - contador];
        int indice = 0;
        for (int num : arreglo) {
            if (num != numero) {
                nuevoArreglo[indice++] = num;
            }
        }

        return nuevoArreglo;
    }
}