package repaso;
import java.util.Scanner;
public class EjercicioCatorce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("num");
        int num = input.nextInt();
        // String binario = Integer.toBinaryString(num);
        //System.out.println("el num es: " + binario);
        String binario = "";
        if (num == 0) {
            binario = "0";
        } else {
            while (num > 0) {
                binario = (num % 2) + binario; // Añadir el residuo al inicio de la cadena
                num = num / 2;
            }
        }

        System.out.println("El número en binario es: " + binario);
    }
}
