import java.util.Scanner;
public class Aprobados {
    public static void main(String[] args) {
        System.out.println("insertar calificacion");
        Scanner input = new Scanner(System.in);
        double grade = input.nextByte();

        if (grade >= 1 && grade < 5) {
            System.out.println("Reprobado");
        }
        else if (grade >= 5 && grade < 7) {
            System.out.println("Aprobado");
        }
        else if (grade >= 7 && grade < 9) {
            System.out.println("Notable");
        }
        else if (grade >= 9 && grade <= 10) {
            System.out.println("Sobresaliente");
        } if (grade == 10) {
            System.out.println("candiato a matricula de honores");
        } else {
            System.out.println("nota invalida");
        }

    }
}
