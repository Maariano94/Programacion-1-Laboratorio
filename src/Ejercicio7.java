import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [20];

        System.out.println("Ingrese 20 números enteros de forma aleatoria: ");
        for(int i = 0; i < 20;i++){
            System.out.println("Ingrese el numero " + i);
            numeros[i] = sc.nextInt();

        }

        numerosPares(numeros);

    }
    public static void numerosPares(int[] pares){
        int par = 0;
        int impar = 0;
        for (int i = 0; i < pares.length ; i++) {
            if(pares[i] % 2 == 0){
                par+=pares[i];
            }else {

                impar+=pares[i];
            }

        }
        System.out.println("La suma de los números pares es: " + par);
        System.out.println("La suma de los numeros impares es: " + impar);
    }

}
