class Palindrome {
    public boolean isPalindrome(int x){

        if (x<0){
            return false;
        }
        int reverse = 0;
        int backup = x; //x se divide constantemente, esta este es un respaldo para comparar el nuevo num al original

        while (x>0 ){
            reverse = reverse*10 + x%10;
            x /= 10;
        }
        return backup == reverse;
    }

    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();

        int numberToCheck = 123454321;
        boolean result = palindromeChecker.isPalindrome(numberToCheck);

        System.out.println("¿Es " + numberToCheck + " un palíndromo? " + result);
    }
}

