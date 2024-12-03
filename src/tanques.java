import java.util.Scanner;
public class tanques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe la cantidad de escenarios");
        int escenarios = input.nextInt();
        input.nextLine();
//        System.out.println("Escribe la capacidad del tanque mas grande");
//        int cap = input.nextInt();
//        System.out.println("Escribe la diferencia entre cada tanque");
        for(int i=0; i<escenarios; i++) {
//            int diferencia = input.nextInt();
//
//            int formula = cap - (cantidad - 1) * diferencia;
//            int resultado = 0;
//            for (int i = cap; i >= formula; i -= diferencia) {
//                resultado = resultado + i;
            String lineas = input.nextLine();
            String[] numeros = lineas.split(" ");
            int cantidad = Integer.parseInt(numeros[0]);
            int capacidad = Integer.parseInt(numeros[1]);
            int diferencia = Integer.parseInt(numeros[2]);
            int formula = capacidad + diferencia;
            int resultado = 0;



            if (cantidad > 0 && capacidad > 0 && diferencia >= 0) {
                for (int j = 0; j < cantidad; j++) {

                    formula -= diferencia;
                    resultado += diferencia;
                }

            }
            System.out.println(resultado);



            if (0 < resultado << 10000) {

                System.out.println("Resultado es: " + resultado);
                input.close();
            } else {
                System.out.println("cantidad no valida");
            }

            }

        }
    }
