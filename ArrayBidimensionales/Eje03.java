package ArrayBidimensionales;

/*Ejercicio 3
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
*/

public class Eje03 {

    public static int[][] rellanaAleatorios(int[][] array){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)((Math.random()*900)+100);
            }
        }
        return array;
    } 

    public static void pintaTabla(int[][] array){
        System.out.println("┌────┬────┬────┬────┬────┬────────┐"); //Primera línea

        int sumaFila = 0;
        int sumFilaTot = 0;
        for (int fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            System.out.print("│");
            for (int columna = 0; columna < 5; columna++) {
                System.out.printf("%4d│",array[fila][columna]);
                sumaFila+=array[fila][columna];
            }
            sumFilaTot+=sumaFila;
            System.out.printf("SF%d %4d│",(fila+1),sumaFila);
            System.out.println();
            System.out.println("├────┼────┼────┼────┼────┼────────┤");
        }


        int sumaCol = 0;
        int sumaColTot = 0;
        for (int columna = 0; columna < 5; columna++) {
            sumaCol = 0;
            System.out.print("│");
            for (int fila = 0; fila < 4; fila++) {
                sumaCol+= array[fila][columna];
            }
            sumFilaTot+=sumaCol;
            System.out.printf("%4d",sumaCol);
        }
        System.out.printf("│FC %5d│\n",(sumaColTot+sumFilaTot));
        System.out.println("└────┴────┴────┴────┴────┴────────┘"); // Última línea
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] array = new int[4][5];
        pintaTabla(rellanaAleatorios(array));
    }
}
