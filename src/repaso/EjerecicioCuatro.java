package repaso;
import java.util.Scanner;
public class EjerecicioCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Incierte un numero");
        int A = input.nextInt();
        System.out.println("incierte una potencia");
        int B = input.nextInt();
        int C= (int) Math.pow(A, B);
        System.out.println("el resultado es: " +C);
        input.close();
    }
}
