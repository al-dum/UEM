/*
Promedios
@Aldo Zamora Loya
 */


import java.util.Scanner;

public class AldoZamoraPromedios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuanto vendio en esta semana?");
        float semana1 = input.nextFloat();
        System.out.println("Cuanto vendio en esta semana?");
        float semana2 = input.nextFloat();
        System.out.println("Cuanto vendio en esta semana?");
        float semana3 = input.nextFloat();
        System.out.println("Cuanto vendio en esta semana?");
        float semana4 = input.nextFloat();
        input.close();
        float total = (int) ((semana1+semana2+semana3+semana4)/4);
        System.out.println(total);


    }


}

/*
cuantos segundos hay en 42 minutos y 42 segundos
cuantas millas hay en 10m milla = 1.61km
si corres una carrera de 10km y tomas 42 min 42 seg
cual es tu vel en kmseg
miles/seg
mseg
 */