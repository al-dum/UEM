package repaso;
import java.util.Scanner;
public class EjercicioOcho {
    public static boolean Prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                return false;
            }
        return true;
        }
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("num");
            int num = input.nextInt();
            if (Prime(num)) {
                System.out.println(num + " es un número primo.");
            } else {
                System.out.println(num + " no es un número primo.");
            }
            input.close();
        }
    }