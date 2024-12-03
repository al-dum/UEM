import java.util.Scanner;
public class Temperatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ELiga sistema celcius o fahrenheit");
        String decision = input.nextLine();
        if (decision.equalsIgnoreCase("celcius")){
            System.out.println("incierte temperatura");
            double temp = input.nextDouble();
            double conversion = (temp*1.8)+32;
            System.out.println("en grados fahrenheit la temperatura es: " + conversion);

        }
        else if (decision.equalsIgnoreCase("fahrenheit")){
            System.out.println("incerte temperatura");
            double pmet = input.nextDouble();
            double noisrevnoc = ((pmet- 32)*5)/9;
            System.out.println("en grados celcius la temperatura es: " + noisrevnoc);

        }
        else { System.out.println("Valor no valido");
        }
    }


}
