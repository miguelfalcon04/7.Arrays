/*Ejercicio 13
Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). 
A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
*/

public class Eje13 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*501);
            System.out.print(array[i]+" ");

            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            } 
        }

        System.out.println();
        System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int opc = Integer.parseInt(System.console().readLine());

        switch (opc) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    if(array[i]==min){
                        System.out.printf("**%d** ",array[i]);
                    }else{
                        System.out.print(array[i]+" ");
                    }
                }
                break;

            case 2:
                for (int i = 0; i < array.length; i++) {
                    if(array[i]==max){
                        System.out.printf("**%d** ",array[i]);
                    }else{
                        System.out.print(array[i]+" ");
                    }
                }
                break;
        
            default:
                System.out.print("Introduzca una opción válida");
                break;
        }

    }
}
