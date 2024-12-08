import java.util.Scanner;

public class MatricesEjercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe cuantas filas y columnas quieres que sea la matriz");
        int filas = input.nextInt();
        int columnas = input.nextInt();
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        int[][] matrizC = new int[filas][columnas];

        System.out.println("Ingrese los valores para la Matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese el valor para la posición [%d][%d]: ", i, j);
                matrizA[i][j] = input.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la Matriz B:");
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese el valor para la posición [%d][%d]: ", i, j);
                matrizB[i][j] = input.nextInt();
            }
        }

        System.out.println("""
                                   Elija qué operación desea hacer con estas 2 matrices:
                                   1. Sumarlas
                                   2. Restarlas
                                   3. Multiplicarlas
                                   4. Producto de escala
                                   5. Determinante de matriz
                                   6. Identidad""");

        int operador = input.nextInt();
        switch (operador){
            case 1:
                //suma
                for(int i=0; i<filas;i++){
                    for (int j=0; j<3; j++){
                        matrizC[i][j]= matrizA[i][j]+matrizB[i][j];
                    }
                }
                System.out.println("\nMatriz Resultante (A + B):");
                imprimirMatriz(matrizC);
                break;

            case 2:
                //resta
                for(int i=0; i<filas;i++){
                    for (int j=0; j<3; j++){
                        matrizC[i][j]= matrizA[i][j]-matrizB[i][j];
                    }
                }
                System.out.println("\nMatriz Resultante (A - B):");
                imprimirMatriz(matrizC);
                break;

            case 3:
                //multiplicarlas
                for(int i=0; i<filas;i++){
                    for (int j=0; j<3; j++){
                        matrizC[i][j]= matrizA[i][j]*matrizB[i][j];
                    }
                }
                System.out.println("\nMatriz Resultante (A * B):");
                imprimirMatriz(matrizC);
                break;

            case 4:
            //escala
                System.out.println("Ingrese la escala para Matriz A:");
                int escalarA = input.nextInt();
                System.out.println("Ingrese la escala para Matriz B:");
                int escalarB = input.nextInt();

                // Multiplicar Matriz A por un numero
                for(int i = 0; i < filas; i++){
                    for (int j = 0; j < columnas; j++){
                        matrizC[i][j] = matrizA[i][j] * escalarA;
                    }
                }
                System.out.println("\nMatriz A por escalar " + escalarA + ":");
                imprimirMatriz(matrizC);

                // Multiplicar Matriz B por un numero
                for(int i = 0; i < filas; i++){
                    for (int j = 0; j < columnas; j++){
                        matrizC[i][j] = matrizB[i][j] * escalarB;
                    }
                }
                System.out.println("\nMatriz B por escalar " + escalarB + ":");
                imprimirMatriz(matrizC);
                break;

            case 5:
                //determinante
                if (filas == columnas) {
                    System.out.println("Determinante Matriz A: " + determinante(matrizA));
                    System.out.println("Determinante Matriz B: " + determinante(matrizB));
                } else {
                    System.out.println("Error: El determinante solo se puede calcular en matrices cuadradas.");
                }
                break;

            case 6:
                // Matriz Identidad
                if (filas == columnas) {
                    int[][] identidad = generarMatrizIdentidad(filas);
                    System.out.println("\nMatriz Identidad:");
                    imprimirMatriz(identidad);
                } else {
                    System.out.println("Error: La matriz identidad solo se puede generar para matrices cuadradas.");
                }
                break;

            case 7:
                // Verificar matriz de identidad
                System.out.println("Elija qué matriz quiere verificar:");
                System.out.println("1. Matriz A");
                System.out.println("2. Matriz B");
                int seleccionMatriz = input.nextInt();

                int[][] matrizAVerificar = (seleccionMatriz == 1) ? matrizA : matrizB;

                if (esMatrizIdentidad(matrizAVerificar)) {
                    System.out.println("La matriz es una matriz de identidad.");
                } else {
                    System.out.println("La matriz NO es una matriz de identidad.");
                }
                break;
            default:
                System.out.println("Operación no válida.");

        }
        input.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
    }

    public static int determinante(int[][] matriz) {
        int n = matriz.length;

        // Caso base para matriz 1x1
        if (n == 1) {
            return matriz[0][0];
        }

        // Caso base para matriz 2x2
        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        // Caso para matrices 3x3 usando regla de Sarrus
        if (n == 3) {
            return (matriz[0][0] * matriz[1][1] * matriz[2][2] +
                    matriz[0][1] * matriz[1][2] * matriz[2][0] +
                    matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                    (matriz[0][2] * matriz[1][1] * matriz[2][0] +
                            matriz[0][0] * matriz[1][2] * matriz[2][1] +
                            matriz[0][1] * matriz[1][0] * matriz[2][2]);
        }

        // Si la matriz es más grande se tiene que usar otro metodo
        System.out.println("Determinante para matrices mayores a 3x3 requiere métodos más complejos.");
        return 0;
    }

    //metodo para generar matriz identidad
    public static int[][] generarMatrizIdentidad(int n) {
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }
        return identidad;
    }

    public static boolean esMatrizIdentidad(int[][] matriz) {
        // solo funciona si la matriz es un cuadrado, aqui se verifica que lo sea
        int n = matriz.length;
        for (int[] ints : matriz) {
            if (ints.length != n) {
                return false;
            }
        }

        // Condiciones de matriz identidad
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // La diagonal debe ser 1
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }
                // Fuera de la diagonal debe ser 0
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}