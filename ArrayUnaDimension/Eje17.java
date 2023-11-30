package ArrayUnaDimension;
/*Ejercicio 17
Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.
*/

public class Eje17 {

    public static int[] aleatoriosArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*101);
        }
        return array;
    }

    public static void imprimeTabla(int[] array){
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.printf("|%-9s|","Iteración");
        for(int i=0; i<array.length; i++){
            System.out.printf("%3d |",i);
        }
        System.out.println();
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("|Ocupación|");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d |",array[i]);
        }
        System.out.println();
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    public static boolean buscaNumero(int[] array, int num){
        boolean contiene = false;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                contiene = true;
            }
        }
        return contiene;
    }

    public static int[] rotaArray(int[] array, int num){
        int[] aux = new int[array.length];

        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=num){
                cont++;
            }else{
                break;
            }
        }

        for (int i = 0; i < (array.length-cont); i++) {
            if(i!=0){
                for (int k = 0; k < aux.length; k++) {
                    array[k]=aux[k];
                }
            }
            for (int j = 0; j < array.length; j++) {
                if(j==array.length-1){
                    aux[0]=array[j];
                }else{
                    aux[j+1]=array[j];
                }
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        int[] array = new int[8];

        imprimeTabla(aleatoriosArray(array));

        System.out.print("Introduzca un número del array y será rotado hasta la primera posición: ");
        int num = Integer.parseInt(System.console().readLine());

        boolean contiene = buscaNumero(array, num);
        if(contiene==false){
            do {
                System.out.print("Introduzca un número existente dentro del array: ");
                num = Integer.parseInt(System.console().readLine());
                contiene=buscaNumero(array, num);
            } while (contiene==false);
        }

        imprimeTabla(rotaArray(array, num)); 

    }
}
