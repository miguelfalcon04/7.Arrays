package ArrayBidimensionales;
/*Ejercicio 1
Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura. */

public class Eje01 {

    public static void imprimeTabla(int[][] array){
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┐"); //Primera línea
        System.out.printf("│%-9s│","Array num");
        for(int fila=0; fila<6; fila++){
            System.out.printf("%3d │",fila);
        }

        System.out.println();
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┤");
        System.out.printf("│%-9s│","Fila 0");
        for (int columna = 0; columna < 6; columna++) {
            System.out.printf("%3d │",array[0][columna]);
        }

        System.out.println();
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┤");
        System.out.printf("│%-9s│","Fila 1");
        for (int columna = 0; columna < 6; columna++) {
            System.out.printf("%3d │",array[1][columna]);
        }

        System.out.println();
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┤");
        System.out.printf("│%-9s│","Fila 3");
        for (int columna = 0; columna < 6; columna++) {
            System.out.printf("%3d │",array[2][columna]);
        }

        System.out.println();
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┘"); // Última línea
    }

    public static void main(String[] args) {

        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        imprimeTabla(num);

    }
}
