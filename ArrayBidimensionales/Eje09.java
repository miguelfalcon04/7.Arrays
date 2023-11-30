package ArrayBidimensionales;

/*Ejercicio 9
Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados.
*/

public class Eje09 {

    static String horizontal = "\u2550";
    static String vertical = "\u2551";
    static String esquinaSupIzq = "\u2554";
    static String esquinaSupDer = "\u2557";
    static String esquinaInfIzq = "\u255A";
    static String esquinaInfDer = "\u255D";
    static String medio = "\u256C";
    static String medioArriba = "\u2566";
    static String medioAbajo = "\u2569";
    static String medioDer = "\u2563";
    static String medioIzq = "\u2560";    

    public static void pintaTabla(int[][] matriz){
        int cont = 0;


        System.out.printf("   %s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n",esquinaSupIzq,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,esquinaSupDer);
        System.out.printf("   %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s%3d %s\n",vertical,0,vertical,1,vertical,2,vertical,3,vertical,4,vertical,5,vertical,6,vertical,7,vertical,8,vertical,9,vertical,10,vertical,11,vertical);
        System.out.printf("%s%s%s",esquinaSupIzq,horizontal,horizontal);
        System.out.printf("%s",medio);
        for (int i = 0; i < 59; i++) {
            if(cont!=4){
                System.out.printf("%s",horizontal);
                cont++;
            }else{
                System.out.printf("%s",medio);
                cont=0;
            }
        }
        System.out.printf("%s\n",medioDer);

        int fil = 12;
        int col = 12;
        cont = 0;
        for (int i = 0; i < fil; i++) {
            cont = 0;
            System.out.printf("%s%2d%s",vertical,(i),vertical);

            for (int j = 0; j < col; j++) {
                System.out.printf("%3d %s",matriz[i][j],vertical);
            }
            
            System.out.println();
            if(i!=11){
                System.out.printf("%s%s%s%s",medioIzq,horizontal,horizontal,medio);
            }else{
                System.out.printf("%s%s%s%s",esquinaInfIzq,horizontal,horizontal,medioAbajo);
            }
            for (int k = 0; k < 39; k++) {
                if(cont!=4){
                    System.out.printf("%s",horizontal);
                    cont++;
                }else{
                    if(i!=7){
                        System.out.printf("%s",medio);
                    }else{
                        System.out.printf("%s",medioAbajo);
                    }
                    cont=0;
                }
            }
            if(i!=11){
                System.out.printf("%s",medioDer);
            }else{
                System.out.printf("%s",esquinaInfDer);
            }

            System.out.println();
        }
    }

    public static int[][] rellenaAleatorios(int[][] matriz){
        for (int fila = 0; fila < 12; fila++) {
            for (int columna = 0; columna < 12; columna++) {
                matriz[fila][columna] = (int)(Math.random()*101);
            }
        }
        return matriz;
    }

    public static void main(String[] args) {

        int matriz [][] = new int[12][12];

        pintaTabla(rellenaAleatorios(matriz));





        
    }
}
