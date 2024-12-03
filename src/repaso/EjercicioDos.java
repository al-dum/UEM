package repaso;
import java.util.Scanner;
public class EjercicioDos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("incierte un numero");
        int num = input.nextInt();
        double test = Math.sqrt(num);
        if (num == Math.pow(test, 2)){
            System.out.println("el numero es el cuadrado de: "+ test);
        }else{
            System.out.println("el numero no es el cuadrado de otro");
        }
        input.close();
    }
}
