public class idk {
    //recursividad
    // consiste en la invocacion de una funcion durante la ejecucion de esa misma.
    // pros: facil de codificar y es mas corto, mas facil trabajar cone strucuturas de datos como arboles, grafos, listas enlazadas
    // cons difific comprension de lfujho que sigue, mucha memoria, errores de pila

    //estructura de almacenamiento de datos
    // pila y cola son maneras de almacenar datos

    public static void recursivo(int i, int[] arr, int numABuscar){
        if(arr[i]== numABuscar){
            System.out.println("Numero encontrado");
            return;
        }
        else if (i == arr.length){
            System.out.println("numero no encontrado");
            return;
        } else{
           i++;
           recursivo(i,arr, numABuscar);
        }


//        int b = a-1;
//        System.out.println("Dato: "+ b);
//        if(b==0){
//            return;
//        }
//        recursivo(b);
//        System.out.println("Volviendo a nivel superior");



    }

    public static void main(String[] args) {
        int [] arr = {1,-4,3,4,5,6,7};
        recursivo(0, arr, 5);
    }


}
