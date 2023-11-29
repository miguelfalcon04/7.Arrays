package ArrayBidimensionales;

/*Ejercicio 8
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
*/

public class Eje08 {

    public static final String RESET = "\033[0m";
    public static final String VERDE = "\033[42m";

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

    public static void pintaTablero(int filaAlfil, int columnaAlfil){
        int cont = 0;
        String concatenaPosiciones = "El álfil puede moverse a las siguientes posiciones:\n";

        System.out.printf("   %s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n",esquinaSupIzq,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,medioArriba,horizontal,horizontal,horizontal,horizontal,esquinaSupDer);
        System.out.printf("   %s%3s %s%3s %s%3s %s%3s %s%3s %s%3s %s%3s %s%3s %s\n",vertical,"a",vertical,"b",vertical,"c",vertical,"d",vertical,"e",vertical,"f",vertical,"g",vertical,"h",vertical);
        System.out.printf("%s%s%s",esquinaSupIzq,horizontal,horizontal);
        System.out.printf("%s",medio);
        for (int i = 0; i < 39; i++) {
            if(cont!=4){
                System.out.printf("%s",horizontal);
                cont++;
            }else{
                System.out.printf("%s",medio);
                cont=0;
            }
        }
        System.out.printf("%s\n",medioDer);

        int fil = 8;
        int col = 8;
        cont = 0;
        for (int i = 0; i < fil; i++) {
            cont = 0;
            System.out.printf("%s%d %s",vertical,(i),vertical);

            for (int j = 0; j < col; j++) {
                if(i==filaAlfil && j==columnaAlfil){
                    System.out.printf("%3s %s","X",vertical);
                }else if(perteneceDiagonal(i, j, filaAlfil, columnaAlfil) == true){
                    System.out.printf("%s%4s%s%s",VERDE," ", RESET ,vertical);

                    switch (j) {
                        case 0:
                            concatenaPosiciones+="a";
                            break;

                        case 1:
                            concatenaPosiciones+="b";
                            break;

                        case 2:
                            concatenaPosiciones+="c";
                            break;

                        case 3:
                            concatenaPosiciones+="d";
                            break;

                        case 4:
                            concatenaPosiciones+="e";
                            break;

                        case 5:
                            concatenaPosiciones+="f";
                            break;

                        case 6:
                            concatenaPosiciones+="g";
                            break;

                        case 7:
                            concatenaPosiciones+="h";
                            break;
                    }
                    concatenaPosiciones+=String.valueOf(i)+" ";

                }else{
                    System.out.printf("%4s%s"," ",vertical);
                }
            }
            
            System.out.println();
            if(i!=7){
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
            if(i!=7){
                System.out.printf("%s",medioDer);
            }else{
                System.out.printf("%s",esquinaInfDer);
            }

            System.out.println();
        }

        System.out.println(concatenaPosiciones);
    }

    public static boolean perteneceDiagonal(int posFilaArray, int posColumnaArray, int filaAlfil, int columnaAlfil){
        boolean esta = false;
        int lejania = 0;

        // CASO ARRIBA IZQUIERDA
        if(posFilaArray < filaAlfil && posColumnaArray < columnaAlfil){ 
            lejania = filaAlfil-posFilaArray;
            if(filaAlfil-lejania == posFilaArray && columnaAlfil-lejania == posColumnaArray ){
                esta = true;
            }
        }

        // CASO ARRIBA DERECHA
        if(posFilaArray < filaAlfil && posColumnaArray > columnaAlfil){ 
            lejania = filaAlfil-posFilaArray;
            if(filaAlfil-lejania == posFilaArray && columnaAlfil+lejania == posColumnaArray ){
                esta = true;
            }
        }

        // CASO ABAJO IZQUIERDA
        if(posFilaArray > filaAlfil && posColumnaArray < columnaAlfil){ 
            lejania = posFilaArray - filaAlfil;
            if(filaAlfil+lejania == posFilaArray && columnaAlfil-lejania == posColumnaArray ){
                esta = true;
            }
        }

        // CASO ABAJO DERECHA
        if(posFilaArray > filaAlfil && posColumnaArray > columnaAlfil){ 
            lejania = posFilaArray - filaAlfil;
            if(filaAlfil+lejania == posFilaArray && columnaAlfil+lejania == posColumnaArray ){
                esta = true;
            }
        }

        return esta;
    }

    public static void main(String[] args) {
        char c = ' ';
        int columna = 0;
        int fila = 0;

        System.out.print("Introduzca la posición del alfil: ");
        String posicion = System.console().readLine();

        c = posicion.charAt(0);

        switch (c) {
            case 'a':
                columna = 0;
                break;

            case 'b':
                columna = 1;
                break;

            case 'c':
                columna = 2;
                break;

            case 'd':
                columna = 3;
                break;

            case 'e':
                columna = 4;
                break;

            case 'f':
                columna = 5;
                break;

            case 'g':
                columna = 6;
                break;

            case 'h':
                columna = 7;
                break;

            default:
                System.out.print("Fuera de rango");
                break;
        }

        fila = Character.getNumericValue(posicion.charAt(1));

        pintaTablero(fila,columna);
    }
}