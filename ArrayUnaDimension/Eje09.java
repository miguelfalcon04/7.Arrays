package ArrayUnaDimension;
/*Ejercicio 9
Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.
*/

public class Eje09 {
    public static void main(String[] args) {

        int[] array = new int[8];

        for(int i=0; i<array.length; i++){
            System.out.print("Introduzca su número: ");
            array[i] = Integer.parseInt(System.console().readLine()); 
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.printf("%d: %d Par",(i+1),array[i]);
            }else{
                System.out.printf("%d: %d Impar",(i+1),array[i]);
            }
            System.out.println();
        }

    }
}
