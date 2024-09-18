import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[5];
        int[] arreglo2 = new int[10];
        int[] arreglo3 = new int[5];


        System.out.println("Introduce 5 números enteros para el primer arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Posición " + i + ": ");
            arreglo1[i] = scanner.nextInt();
        }


        System.out.println("Introduce 10 números enteros para el segundo arreglo:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("Posición " + i + ": ");
            arreglo2[i] = scanner.nextInt();
        }


        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = 0; // Inicializar la posición del tercer arreglo
            for (int j = 0; j < arreglo2.length; j++) {
                arreglo3[i] += arreglo1[i] * arreglo2[j];
            }
        }


        System.out.println("Primer arreglo:");
        mostrarArreglo(arreglo1);

        System.out.println("Segundo arreglo:");
        mostrarArreglo(arreglo2);

        System.out.println("Tercer arreglo (resultado):");
        mostrarArreglo(arreglo3);

        scanner.close();
    }


    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
}