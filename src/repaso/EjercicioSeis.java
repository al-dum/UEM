package repaso;
import java.util.Scanner;
public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.print("incierte un numero para sumar: ");
            N= input.nextInt();
            if(N>=0 ) {
                int suma = 0;

                for (int j = 1; j <= N; j++) {
                    suma += j;
                }
                System.out.println("La suma es: "+ suma);
            }
        } while(N>=0);
        System.out.println("fin");
        input.close();
    }
}
