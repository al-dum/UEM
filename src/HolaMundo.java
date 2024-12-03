/*
Nuestro primer programa
imprime por pantalla "Hola Mundo"

@ Aldo Zamora Loya
 */
import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        System.out.println("¡Hola usuario!");
        Scanner input = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombre = input.nextLine();
        System.out.println("Mucho gusto "+ nombre);
        System.out.println("How old are you?");
        int age = input.nextInt();
        if (age > 17){
        System.out.println("Bro is safe from drake");}
        else{
        System.out.println("run from drizzy");
        }
        input.close();
    }

}




// main es el metodo principal asi que es el que se ejecuta. sin main ninguna fucnion se ejecuta
// codigo fuente es un java. (la clase con el nombre del programa y podemos poner un metodo peor tambien tenemos que tener un main, luego se compila, el compilador interpeta el codigo escrito en comanos que entiende
// java a binario
// el codigo ejecutable es binario
//  javac nombredelcodigo.java
// si hay un error en vez de ejecutar manda un mensaje de error
// 