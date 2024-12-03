import java.math.BigInteger;
import java.util.Scanner;
public class PalindromeBigInteger {
    public static boolean isPalindrome(BigInteger num) {
        // Reverse the given BigInteger
        BigInteger reversedNum = reverseBigInteger(num);

        // Compare both BigIntegers
        return num.compareTo(reversedNum) == 0;
    }

    // Method to reverse a BigInteger
    public static BigInteger reverseBigInteger(BigInteger num) {
        // Convert the BigInteger to a string
        String str = num.toString();

        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Convert the reversed string back to BigInteger
        return new BigInteger(reversedStr);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger bigInt = input.nextBigInteger(); // Example palindrome number
        if (isPalindrome(bigInt)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
