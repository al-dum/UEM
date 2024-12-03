package repaso;
import java.util.Scanner;
public class EjercicioNueve {
//    public static void Formula(int num1, int num2){
//        num1 = Integer.parseInt(minInput.getText());
//        double ejecucion = num1 + num2;
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("num");
        int num1 = input.nextInt();
        System.out.println("num");
        int num2 = input.nextInt();
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min+1; i<max; i++){
            if( i%2!=0){
                System.out.print(i+ " ");
            }
        }
        input.close();
    }
}
