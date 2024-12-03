import java.util.Scanner;
public class romano {
    public static void main(String[] args) {
        int I = 1;
        int V = I+4;
        int X = V*2;
        int L = 5*X;
        int C = 2*L;
        int D = 5*C;
        int M= 2*D;

        System.out.println("inserte su nuemro en romano");
        Scanner input = new Scanner(System.in);

        System.out.println(V);
    }
}
