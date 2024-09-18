import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();

        System.out.println("Ingrese el número del cual se generarán los múltiplos: ");
        int numero = sc.nextInt();

        int [] array = new int [tamano];

        llenarArrayConMultiplos(array, numero);

        mostrarArray(array);

        sc.close();

    }
    public static void llenarArrayConMultiplos (int [] array, int numero){

        for (int i = 0; i < array.length; i++){

            array[i] = numero * (i+1);

        }

    }

    public static void mostrarArray(int [] array) {

        System.out.println("Contenido del array: ");

        for (int i=0; i < array.length;i++){

            System.out.println(array[i] + " ");
        }
    }

}
