package ArrayBidimensionales;
/*Ejercicio 2
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
*/

public class Eje02 {

    public static int[][] rellanaAleatorios(int[][] array){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(Math.random()*101);
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[][] array = new int[4][5];

        rellanaAleatorios(array);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
