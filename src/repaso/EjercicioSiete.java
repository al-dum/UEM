package repaso;
import java.util.Scanner;
public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numero");
        int n = input.nextInt();
        int horas = n/3600;
        int minutos = (n%3600)/60;
        int seg = n%60;
        System.out.println("segundos son: "+ horas+ " hora(s) "+ minutos+" minutos "+seg+" segundos" );
        input.close();
    }
}
