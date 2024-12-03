
import java.util.Scanner;

public class AldoZamoraConsversiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("minutos");

        int min = input.nextInt();
        System.out.println("segundos");
        int sec = input.nextInt();
        int tiempo_convertido = (min*60) + sec;
        System.out.println(tiempo_convertido);

        System.out.println("km");
        double distance = input.nextDouble();
        double milla = (distance /1.61);
        //DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(milla);

          double record = distance/tiempo_convertido;
          double record2 = (milla/tiempo_convertido);
          double record3 = (distance/1000)/sec;

        System.out.println("el corrio " +record+ "km por seg");
        System.out.println("el corrio "+record2+ "millas por seg");
        System.out.println("el corrio"+record3 + "metros por seg");
        input.close();








// convertir grados celcius a farenheit y viceversa

    }

}
