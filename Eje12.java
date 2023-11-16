/*Ejercicio 12
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
*/

public class Eje12 {

    /**
     * It will paint a board with an Array given
     * @param n
     */
    public static void tabla(int[] n){
        System.out.print("Indice |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d |",i);
        }
        System.out.println();
        System.out.printf("%6s |","Valor");
        for (int i = 0; i < n.length; i++) {
            System.out.printf("%2d |",n[i]);
        }
        System.out.println();
    }

    public static int[] rotaArray(int[] n, int nInicial, int nFinal){
        int[] resultado = new int[10];

        if(nInicial<nFinal && nInicial>=0 && nInicial<=9 && nFinal>=0 && nFinal<=9){

            for (int i = 0; i < 10; i++) {
                resultado[i] = n[i];
            }
            
            resultado[nFinal] = n[nInicial];
            
            for (int i = nFinal + 1; i < 10; i++){
                resultado[i] = n[i - 1];
            }
            
            resultado[0] = n[9];
            
            for (int i = 0; i < nInicial; i++){
                resultado[i + 1] = n[i];
            }
            
        }else{
            System.out.print("Introduzca correcatamente los datos");
        }
            return resultado;
        }


    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Introduzca el %dº número: ",(i+1));
            array[i] = Integer.parseInt(System.console().readLine());
        }

        tabla(array);

        System.out.println();
        System.out.print("Introduzca su primera posición del array: ");
        int inicial = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca su última posición del array: ");
        int fin = Integer.parseInt(System.console().readLine());
        System.out.println();

        tabla(rotaArray(array, inicial, fin));

        
    }
}
