package repaso;
import java.util.Scanner;
public class EjercicioTrece {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insertar numero: ");
        double pies = input.nextInt();
        double yardas = pies/3;
        double pulgadas = pies*12;
        double centimetros = pies*30;
        double metros = centimetros/100;
        System.out.println("La cantidad es: "+yardas+" en yardas, "+pulgadas+" en pulgadas, "+centimetros+" en cm, "+metros+ " en metros.");
    }
}
