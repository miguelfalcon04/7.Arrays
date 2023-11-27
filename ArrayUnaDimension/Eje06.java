package ArrayUnaDimension;
/*Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
*/

public class Eje06 {
    public static void main(String[] args) {

        int[] array = new int[15];
        int[] arrayConPaso = new int[15];

        for(int i=0; i<array.length; i++){
            System.out.print("Introduzca un número: ");
            array[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i : array) {
            System.out.print(i+" ");
        }

        for(int i=0; i<15; i++){
            if(i<14){
                arrayConPaso[i+1] = array[i];
            }else{
                arrayConPaso[0] = array[i];
            }
        }

        System.out.println();

        for (int i=0; i<arrayConPaso.length; i++) {
            System.out.print(arrayConPaso[i]+" ");
        }

    }
}
