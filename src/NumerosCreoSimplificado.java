import java.math.BigInteger;

public class NumerosCreoSimplificado {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;  // Initialize result to 1
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));  // Multiply result by i
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 50000;  // Example: finding the factorial of 100
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}