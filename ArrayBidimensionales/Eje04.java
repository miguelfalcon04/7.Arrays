package ArrayBidimensionales;

/*Ejercicio 4
Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
*/

public class Eje04{

    public static int[][] rellanaAleatorios(int[][] array){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)((Math.random()*900)+100);
            }
        }
        return array;
    }

    public static void pintaTabla(int[][] array) throws InterruptedException{
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
            Thread.sleep(1500);
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
            Thread.sleep(1500);
            System.out.printf("%4d",sumaCol);
        }
        Thread.sleep(1500);
        System.out.printf("│FC %5d│\n",(sumaColTot+sumFilaTot));
        System.out.println("└────┴────┴────┴────┴────┴────────┘"); // Última línea
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] array = new int[4][5];
        pintaTabla(rellanaAleatorios(array));
    }
}