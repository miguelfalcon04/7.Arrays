package ArrayUnaDimension;
/*Ejercicio 11
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.
*/

public class Eje11 {

    /**
     * You give a number to it and it returns True if a number is a prime number
     * @param n
     * @return True if is a prime / False if is not a prime
     */
    public static boolean esPrimo(int n){ 
        boolean esPrimo =  true;

        for (int i = 2; i <n/2+1; i++) {
            if(n%i==0){
                esPrimo=false;
            }
        }
        return esPrimo;
    }

    /**
     * Give an Array to it, and it will return how many normal Number are
     * @param n
     * @return noPrimo
     */
    public static int cuentaNoPrimos(int[] n){ 
        int noPrimo=0;

        for (int i = 0; i < n.length; i++) {
            if(!esPrimo(n[i])){
                noPrimo++;
            }
        }
        return noPrimo;
    }

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

    /**
     * Give an Array to it and it will put in firts positions the prime number
     * @param n
     * @return aux[]
     */
    public static int[] posicionaPrimos(int[] n){
        int[] aux = new int[10];

        int noPrimos = cuentaNoPrimos(n);
        int cont=0;

        for (int i = 0; i < n.length; i++) {
            if(esPrimo(n[i])){
                aux[cont]=n[i];
                cont++;
            }else{
                aux[n.length-noPrimos] = n[i];
                noPrimos--;
            }
        }
        return aux;
    }

    public static void main(String[] args) {

        int[] array = new int[10];

        for(int i=0; i<array.length; i++){ //Introduce los número en el array
            System.out.printf("Introduzca su %dº número: ",(i+1));
            array[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println();

        System.out.println("¡¡¡ARRAY INICIAL!!!");
        tabla(array);

        System.out.println();

        System.out.println("¡¡¡ARRAY FINAL!!!");
        tabla(posicionaPrimos(array)); 

    }
}
