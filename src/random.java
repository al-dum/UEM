import java.util.Scanner;

public class random {public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int minimo = 1;
    int maximo = 10;
    double random = Math.random();
    int numaadivinar = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    System.out.println("Bienvenido a adivina el numero!");
    boolean adivinado = false;
    int intentos = 0;


    while (!adivinado){
        System.out.println("porfavor inserta un numero");
        int g = input.nextInt();
        intentos++;



        if (g == numaadivinar) { adivinado = true; }
        else if (g < numaadivinar) { System.out.print("Numero muy bajo, intentalo otra vez, "); }
        else if (g > numaadivinar) { System.out.print("Numero muy alto, intentalo otra vez,"); }





    }
    System.out.println("Felicidades, has adivinado el numero " + numaadivinar + " en " + intentos + " intentos");


}




}

















