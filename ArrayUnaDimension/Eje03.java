package ArrayUnaDimension;
/*Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
*/

public class Eje03 {
    public static void main(String[] args) {

        int[] n = new int[10];

        for(int i=9; i>=0; i--){
            System.out.print("Introduzca su número: ");
            n[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i : n) {
            System.out.print(i+" ");
        }

    }
}
