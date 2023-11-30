package ArrayUnaDimension;
/*Ejercicio 19
Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.
*/


public class Eje19 {


    public static void pintaTabla(int[] array){
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice │");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d │",i);
        }
        System.out.println();
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  │");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d │",array[i]);
        }
        System.out.println();
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        System.out.println();
    }

    public static int[] rellenaAleatorios(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*201);
        }
        return array;
    }

    public static int[] rotaArray(int[] array, int valor, int pos){
        int[] aux = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if(i==array.length-1){ // Si esta en el penultimo valor sale
                if(pos==array.length){ // Si la posición para insertar el número es la ultima, asigna el valor y luego sale
                    aux[i]=valor;
                }
                break;
            }

            if(i==pos){
                aux[i+1]=array[i];
                aux[i]=valor;
            }else if(i>pos){
                aux[i+1]=array[i];
            }else{
                aux[i] = array[i];
            }       
        }

        return aux;
    }
    public static void main(String[] args) {
        int[] array = new int[12];

        System.out.println("Array original:");
        pintaTabla(rellenaAleatorios(array));
        System.out.println();

        System.out.print("Introduzca el valor que quiere insertar: ");
        int valor = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int pos = Integer.parseInt(System.console().readLine());
        if(pos<0 || pos>11){
            do {
                System.out.println("Error");
                System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
                pos = Integer.parseInt(System.console().readLine());
            } while (pos<0 || pos>11);
        }
        System.out.println();

        System.out.println("Array resultado:");
        pintaTabla(rotaArray(array, valor, pos));

    }
}
