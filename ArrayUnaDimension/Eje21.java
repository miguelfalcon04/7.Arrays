package ArrayUnaDimension;
/*Ejercicio 21
Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
*/

public class Eje21 {

    public static int[] rellenaAleatorios(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*501);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        return array;
    }

    public static int[] cincuerizaArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%5!=0){
                do {
                    array[i]+=1;
                } while (array[i]%5!=0);
            }
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = new int[15];

        System.out.println("Array original:");
        rellenaAleatorios(array);

        System.out.println();

        System.out.println("Array cincuerizado:");
        cincuerizaArray(array);efwefwefwf

    }
}
