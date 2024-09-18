import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int [] arreglo = new int[50];
        Random random = new Random();


        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo generado: ");
        for(int numero : arreglo){
            System.out.print(numero + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor que desea buscar: ");
        int valorBuscado = sc.nextInt();
        boolean encontrado = false;
        int posicion = -1;

        for(int i = 0; i < arreglo.length; i ++){
            if (arreglo[i] == valorBuscado){
                encontrado = true;
                posicion = i;
                break;
            }
        }
        if (encontrado) {

            System.out.println("El valor " + valorBuscado + " fue encontrado en la posicion " + posicion + ".");

        }else {

            System.out.println("El valor " + valorBuscado + " no fue encontrado en el arreglo.");
        }
    }
}
