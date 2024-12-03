/*
Algoritmos de enteros
@Aldo Zamora Loya
 */
import java.util.Scanner;
public class Zamora_Enteros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // EJERCICIO 1
        /*
        Este ejercico lo que hace es imprimir un mensaje solicitando un numero entero del usuario.
        Una vez que el usuario inserte un numero, el algoritmo imprimara el mensaje mostrando que numero selecciono el usuario
         */
        System.out.println("Hola, favor de insertar un numero entero");
        int entero = input.nextInt();
        System.out.println("Su numero entero es: " + entero);

        //EJECICIO 2
        /*
        En este ejercicio el algoritme solicita dos numeros del usuario,
        primero el usuario inserta un numero y luego el codigo le pide uno mas
        despues el algoritmo imprime la suma de esos numeros
         */
        System.out.println("Favor de dar un numero");
        int inta = input.nextInt();
        System.out.println("Favor de dar un segundo numero");
        int intb = input.nextInt();
        int result = inta + intb;
        System.out.println("La suma de los dos numeros es: " + result);
        input.close();
    }
}


