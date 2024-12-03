package repaso;
import java.util.Scanner;
public class EjercicioTres {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero");
      int N = input.nextInt();
      int suma = 0;

      for(int i=1; i<= N;i++){
          suma+= i;
      }
      System.out.println("La suma es: "+ suma);
      input.close();
    }
}
