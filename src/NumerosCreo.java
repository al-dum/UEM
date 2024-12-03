/*
* Este programa separa las centenas, decenas y unidades de un numero
* @author Aldo Daniel Zamora Loya
* @date 4/10/24
*/
import java.util.Scanner;
public class NumerosCreo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insertar numero");
        int a = input.nextInt();

        int operacion = a/100;
        int operacio = a%100;
        int operaci = operacio/10;
        int operac = operacio%10;



        System.out.println(operacion +" " +operaci + " " +operac);
       // System.out.println(operaci);
       // System.out.println(operac);
    }





}
