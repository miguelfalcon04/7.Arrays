/*Ejercicio 10
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
*/

public class Eje10 {
    public static void main(String[] args) {

        int[] aleatorios = new int[20];
        int imp = 0;

        for (int i=0; i <aleatorios.length; i++){ //Genera los números y cuenta los impares
            aleatorios[i] = (int)(Math.random()*101);

            if(aleatorios[i]%2!=0){
                imp++;
            }
        }

        for (int i = 0; i < aleatorios.length; i++) { //Muestra el array desordenado
            System.out.print(aleatorios[i]+" ");
        }
        System.out.println();

        int[] aux = new int[20];
        int cont=0;

        for (int i=0; i <aux.length; i++){ //Ordena el array en otro auxiliar
            if(aleatorios[i]%2==0){
                aux[cont]=aleatorios[i];
                cont++;
            }else{
                aux[20-imp]=aleatorios[i];
                imp--;
            }
            
        }

        for (int i = 0; i < aux.length; i++) { //Muestra el array auxiliar ordenado
            System.out.print(aux[i]+" ");
        }

    }
}
