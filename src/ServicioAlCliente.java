import java.util.Scanner;

public class ServicioAlCliente {
    public static void main(String[] args) {
        System.out.println("Bienvenido al servicio al cliente, para un mejor servicio clasificamos la asistencia en base al problema.\n" +
                                   "Favor de elegir la opción adecuada:\n" +
                                   "\t1: Ofertas en llamadas\n" +
                                   "\t2: Ofertas en fibra óptica\n" +
                                   "\t3: Ofertas en TV\n" +
                                   "\t4: Reclamaciones\n" +
                                   "\t5: Pulse cualquier otra tecla para hablar con el operador");
        Scanner scanner = new Scanner(System.in);
        String input = String.valueOf(scanner.nextInt());
        if(input.equals("1")){
            System.out.println("Aquí están las ofertas en nuestros planes de llamadas");
        } else if(input.equals("2")){
            System.out.println("Aquí están las ofertas de fibra óptica");
        } else if (input.equals("3")){
            System.out.println("Aquí están las ofertas de TV");
        } else if(input.equals("4")){
            System.out.println("Se le contactará inmediatamente para que pueda hacer su reclamo");
        } else {
            System.out.println("Se le conectará a un operador");
        }
    }
}
