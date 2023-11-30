package ArrayUnaDimension;
/*Ejercicio 20
Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º.
*/

public class Eje20 {

    public static String[] ordinalReyes(String[] array){

        int cont = 1;
        for (int i = 0; i < array.length; i++) {
            cont = 1;
            for (int j = 0; j < i; j++) {
                if(array[i].equals(array[j])){
                    cont++;
                }
            }
            System.out.printf("%s %dº\n",array[i],cont);
        }
        return array;
    }
    public static void main(String[] args) {

        System.out.print("Introduzca el número total de nombre de reyes: ");
        int numReyes = Integer.parseInt(System.console().readLine());

        String[] reyes = new String[numReyes];

        System.out.println("Vaya introduciendo los nombre de los reyes y pulsando INTRO.");
        for (int i = 0; i < reyes.length; i++) {
            reyes[i] = System.console().readLine();
        }
        System.out.println();

        System.out.println("Los reyes introducidos son:");
        ordinalReyes(reyes);asfgasg

    }
}
