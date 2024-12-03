import java.util.Scanner;
public class Switchesblah {
    public static void main(String[] args) {
        System.out.println("Incierte un numero");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("incierte otro numero");
        double num2 = input.nextDouble(), ans = 0;
        System.out.println("incierte un operador (+,-,*,/)");
        char operator = input.next().charAt(0);
        boolean zero = true;

       // int option = (int) operator;

        switch(operator){
            case '+':
                ans= num1 + num2;
                break;

            case '-':
                ans = num1-num2;
                break;
            
            case '*':
                ans = num1*num2;
                break;
                
            case '/':
                zero = false;
                if(num2 !=0){
                ans = num1/num2;
                break;  
                }  else { System.out.println("no se puede dividir entre 0"); }
            
            default:
                System.out.println("operacion no valida");
        }

        if (zero = true) {
            System.out.println("el resultado es: " + ans);
        } else { System.out.println("no se puede dividir entre 0"); }

    }

}
// se usan para casos de string integers and char
/*
switch(varibale){
    case 'a': case "e": case'i':
        break
        }
 */