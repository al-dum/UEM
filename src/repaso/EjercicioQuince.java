package repaso;
import java.util.Scanner;
public class EjercicioQuince {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("mnum");
        int num = input.nextInt();
        int res = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                res += i; // Sumar el divisor a la suma
            }
            if (res ==num) {
                System.out.println(num + " es un número perfecto.");
            } else {
                System.out.println(num + " no es un número perfecto.");
            }
        }
    }
}
