import java.util.Scanner;

public class Meses {

    public static void main(String[] args) throws Exception {
        boolean date = false;
        int day, month, year;
        Scanner input = new Scanner(System.in);

        System.out.println("Día:");
        day = input.nextInt();

        System.out.println("Mes:");
        month = input.nextInt();

        System.out.println("Año:");
        year = input.nextInt();

        if (year > 0) {

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day >= 1 && day <= 29) {
                        date = true;
                    }
                } else {
                    if (day >= 1 && day <= 28) {
                        date = true;
                    }
                }
            }

            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 31) {
                    date = true;
                }
            }

            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 30) {
                    date = true;
                }
            }
        }


        if (date) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }

        input.close();  
    }
}