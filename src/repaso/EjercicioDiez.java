package repaso;
import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar la cantidad de datos
        System.out.print("Ingrese la cantidad de datos: ");
        int cantidad = input.nextInt();

        // Solicitar el valor umbral
        System.out.print("Ingrese el valor umbral: ");
        int umbral = input.nextInt();

        // Contador para los números menores que el umbral
        int contador = 0;

        // Pedir los N datos y contar cuántos son menores que el umbral
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();

            if (numero < umbral) {
                contador++; // Incrementar el contador si el número es menor al umbral
            }
        }

        // Mostrar el resultado
        System.out.println("Cantidad de números menores que el umbral: " + contador);

        input.close();
    }
}