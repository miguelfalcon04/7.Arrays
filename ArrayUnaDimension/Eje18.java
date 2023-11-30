package ArrayUnaDimension;
/*Ejercicio 18
Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.
*/

public class Eje18 {

    public static void pintaTabla(int[] array){
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice │");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d │",i);
        }
        System.out.println();
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  │");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d │",array[i]);
        }
        System.out.println();
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        System.out.println();
    }

    public static int[] rellenaAleatorios(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*201);
        }
        return array;
    }

    public static int[] mayorCien(int[] array){
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>100){
                cont++;
            }
        }

        int[] mayorCien = new int[cont];
        int pos=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>100){
                mayorCien[pos]=array[i];
                pos++;
            }
        }

        return mayorCien;
    }

    public static int[] menorIgualCien(int[] array){
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<=100){
                cont++;
            }
        }

        int[] menorIgualCien = new int[cont];
        int pos=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<=100){
                menorIgualCien[pos]=array[i];
                pos++;
            }
        }

        return menorIgualCien;
    }

    public static int[] turnaMenorMayor(int[] array){
        int[] mayorCien = mayorCien(array);
        int posMayor = 0;
        int[] menorIgualCien = menorIgualCien(array);
        int posMenor = 0;
        int[] turnado = new int[array.length];

        for (int i = 0; i < turnado.length; i++) {
            if(i%2==0 && posMenor<menorIgualCien.length){
                turnado[i] = menorIgualCien[posMenor];
                posMenor++;
            }else if(posMayor<mayorCien.length){
                turnado[i] = mayorCien[posMayor];
                posMayor++;
            }else{
                turnado[i] = menorIgualCien[posMenor];
                posMenor++;
            }
        }

        return turnado;
    }


    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.println("Array Original: ");
        pintaTabla(rellenaAleatorios(array));
        System.out.println();

        System.out.println("Array resultado: ");
        pintaTabla(turnaMenorMayor(array));

    }
}