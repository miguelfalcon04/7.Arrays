/*Ejercicio 16
Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
*/

public class Eje16 {

    public static int[] arrayAleatorios(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*401);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        return array;
    }

    public static void resaltarArray(int[] array, int opc){
        if(opc==1){
            for (int i = 0; i < array.length; i++) {
                if(array[i]%5==0){
                    System.out.printf("[%d] ",array[i]);
                }else{
                    System.out.print(array[i]+" ");
                }
            }
        }else  if(opc==2){
            for (int i = 0; i < array.length; i++) {
                if(array[i]%7==0){
                    System.out.printf("[%d] ",array[i]);
                }else{
                    System.out.print(array[i]+" ");
                }
            }        }else{
            System.out.print("Introduzca una opción válida");
        }
    }

    public static void main(String[] args) {

        int[] array = new int[20];

        arrayAleatorios(array);

        System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int opc = Integer.parseInt(System.console().readLine());

        resaltarArray(array, opc);

    }
}
