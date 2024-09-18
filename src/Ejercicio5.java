import javax.swing.*;
import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {


        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = 2 * (random.nextInt(50) + 1);

        }

        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio aritmético es: " + promedio);

        int igualesAlPromedio = contarIgualesAlPromedio(numeros, promedio);
        System.out.println("Cantidad de números iguales al promedio: " + igualesAlPromedio);

        int mayoresQuePromedio = contarMayoresQuePromedio(numeros, promedio);
        System.out.println("Cantidad de numeros mayores que el promedio: " + mayoresQuePromedio);

        int menoresQuePromedio = contarMenoresQuePromedio(numeros, promedio);
        System.out.println("Cantidad de números menores que en promedio: " + menoresQuePromedio);

    }

    public static double calcularPromedio(int[] arreglo) {

        int suma=0;
        for(int i=0; i < arreglo.length; i++){

            suma += arreglo[i];
        }
        //tipos de datos(castea o transforma una variable a otra).
        return (double) suma / arreglo.length;
    }

    public static int contarIgualesAlPromedio(int[] arreglo, double promedio) {

        int contador = 0;
        for (int num : arreglo) {

            if (num == promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresQuePromedio(int[] arreglo, double promedio) {

        int contador = 0;
        for (int num : arreglo) {
            if (num > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMenoresQuePromedio(int[] arreglo, double promedio) {

        int contador = 0;
        for (int num : arreglo) {
            if (num < promedio) {
                contador++;
            }
        }

        return contador;
    }


}
