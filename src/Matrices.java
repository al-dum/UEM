import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int filas = 3;
        int columnas =3;
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizb = new int[filas][columnas];

        int[][] matrizc = new int[filas][columnas];

        System.out.println("Ingrese los valores para la Matriz A:");
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese el valor para la posición [%d][%d]: ", i, j);
                matrizA[i][j] = input.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la Matriz B:");
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese el valor para la posición [%d][%d]: ", i, j);
                matrizb[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<filas;i++){
            for (int j=0; j<3; j++){
                matrizc[i][j]= matrizA[i][j]+matrizb[i][j];
            }
        }
        System.out.println("\nMatriz Resultante (A + B):");
        imprimirMatriz(matrizc);

        input.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
}
}
// multiplicacion de matrices
// determinante de una amtriz
//introduze un numero para elegir cual de las funciones de matrices hace
// modulo 14,15,16 para redes
