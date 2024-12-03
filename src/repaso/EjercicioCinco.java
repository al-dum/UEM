package repaso;
import java.util.Scanner;
public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Incierte un numero");
        int N = input.nextInt();
        for(int i =1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        input.close();
    }
}
