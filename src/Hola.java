/*
Imprimir Hola Mundo cierto numero de veces
@author Aldo Zamora Loya
@date 25/10/2024
 */

import java.util.Scanner;
public class Hola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numero de veces: ");
        int n = input.nextInt();

        if(n >= 0&&n<= 5){
            for(int i = 1; i<=n; i++){
                System.out.println("Hola Mundo");
            }
        }
    }
}
