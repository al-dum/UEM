package repaso;
import java.util.Scanner;
public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserte el numero de su carta: ");
        int tipo = input.nextInt();
        if(tipo<=40&&tipo>=1){
            String palo = "";
            int valor = 0;

            if (tipo >= 1 && tipo <= 10) {
                // System.out.println("Oros");
                palo = "Oros";
                valor = tipo;
            } else if (tipo >= 11 && tipo <= 20) {
                //  System.out.println("Copas");
                palo = "Copas";
                valor = tipo-10;
            }
            else if (tipo >= 21 && tipo <= 30) {
                //  System.out.println("Espadas");
                palo = "Espadas";
                valor = tipo-20;
            }
            else if (tipo >= 31 && tipo <= 40) {
                //  System.out.println("Bastos");
                palo = "Bastos";
                valor = tipo-30;
            }
            System.out.println("La carta es el " + valor + " de " + palo);
        } else {
            System.out.println("tiene que ser entre 1 y 40");
        }
    }
}
