import java.util.Scanner;

public class ProblemaDelGranjero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ayuda hay un granjero con una oveja, un lobo y un saco de comida y tiene que cruzar un rio pero en su bote solo puede llevar un objeto a la vez como debeira hacerlo?");
        String step1 = input.nextLine();
        if (step1 == "cruzar oveja") {
            System.out.println("OK");
        } else if (step1 == "lobo") {
            System.out.println("La oveja se comio la comida");
        }
        String step2 = input.nextLine();
        System.out.println("OK");
        String step3 = input.nextLine();
        System.out.println("OK");
        String step4 = input.nextLine();
        System.out.println("OK");
        String step5 = input.nextLine();
        System.out.println("OK");
        String step6 = input.nextLine();
        System.out.println("OK");
        String step7 = input.nextLine();
        input.close();
        System.out.println("WOW funcionó, gracias");
    }

    /*
    solucion:
   lleva primero a la oveja al otro lado
	Regresa solo
	Lleva ahora al lobo al otro lado
	Regresa con la oveja al lado inicial.
	lleva la comida al otro lado
	regresar solo
	 lleva de nuevo a la oveja al otro lado del río.
     */
}


