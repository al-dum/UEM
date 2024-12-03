package repaso;
import java.util.Scanner;
public class EjercicoUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int num;
        do{
            System.out.print("Incierte un número: ");
            num = input.nextInt();
            if(num%2 ==0){
            System.out.println("El número es par.");
        } else {
                System.out.println("El número no es par.");
            }
        }while(num>=0);
        System.out.println("fin");
        input.close();
    }
}
