/*Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
*/

public class Eje05 {
    public static void main(String[] args) throws Exception{

        int[] n = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for(int i=0; i<10; i++){
            System.out.print("Introduzca su número: ");
            n[i] = Integer.parseInt(System.console().readLine());

            if(n[i]>maximo){
                maximo=n[i];
            }
            if(n[i]<minimo){
                minimo=n[i];
            }
        }

        System.out.println();

        for(int i=0; i<10; i++){
            if(n[i]==maximo){
                System.out.println(n[i]+" máximo");
            }else if(n[i]==minimo){
                System.out.println(n[i]+" mínimo");
            }else{
                System.out.println(n[i]);
            }
        }

    }
}
