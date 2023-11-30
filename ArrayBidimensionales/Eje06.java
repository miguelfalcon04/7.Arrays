package ArrayBidimensionales;

public class Eje06 {

    public static final String RESET = "\033[0m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";

    public static int[][] rellanaAleatorios(int[][] array) {
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                array[fila][columna] = (int) (Math.random() * 1001);
    
                // Verificar duplicados hasta la posición actual
                while (existeDuplicado(array, fila, columna)) {
                    array[fila][columna] = (int) (Math.random() * 1001);
                }
            }
        }
        return array;
    }
    
    // Verifica si hay duplicados hasta la posición actual en la matriz
    public static boolean existeDuplicado(int[][] array, int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[fila][columna] == array[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    

    public static void pintaTabla(int[][] array){

        int max = buscaMax(array);
        int min = buscaMin(array);
        String color = "";
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐"); //Primera línea
        for (int fila = 0; fila < 6; fila++) {
            System.out.printf("│%-6s %dº│","Fila ",(fila+1));
            for (int columna = 0; columna < 10; columna++) {
                if(array[fila][columna] == max){
                    color = GREEN_BACKGROUND;
                    System.out.printf("%s%4d%s│",color,array[fila][columna],RESET);

                }else if(array[fila][columna] == min){
                    color = RED_BACKGROUND;
                    System.out.printf("%s%4d%s│",color,array[fila][columna],RESET);
                }else{
                    System.out.printf("%4d│",array[fila][columna]);
                }
            }
            System.out.println();
            if(fila!=5){
                System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
            }else{
                System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘"); // Última línea
            }
        }
    }

    public static int buscaMax(int[][] array){
        int max = Integer.MIN_VALUE;
        int posF = 0;
        int posC = 0;
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                if(array[fila][columna] > max){
                    max = array[fila][columna];
                    posF = fila;
                    posC = columna;
                }
            }
        }
        System.out.printf("El mayor número se encuentra en la fila %d columna %d\n",(posF+1),(posC+1));
        return max;
    }

    public static int buscaMin(int[][] array){
        int min = Integer.MAX_VALUE;
        int posF = 0;
        int posC = 0;
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                if(min > array[fila][columna]){
                    min = array[fila][columna];
                    posF = fila;
                    posC = columna;
                }
            }
        }

        System.out.printf("El menor número se encuentra en la fila %d columna %d\n",(posF+1),(posC+1));
        return min;
    }

    public static void main(String[] args) {
        int[][] array = new int[6][10];
        pintaTabla(rellanaAleatorios(array));
    }
}
