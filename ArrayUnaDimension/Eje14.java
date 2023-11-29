package ArrayUnaDimension;
/*Ejercicio 14
Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
*/

public class Eje14 {

    public static void imprimeTabla(String[] array){
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d    |",i);
        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-8s|",array[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        System.out.println();
    }

    public static String[] posicionaColores(String[] array){
        String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        String[] aux = new String[8];
        int numColores = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if(array[i].equals(colores[j])){
                    numColores++;
                }
            }
        }

        int cont=0;
        boolean entra = false;
        int palabras = (array.length)-numColores;

        for (int i = 0; i < array.length; i++) {
            entra = false;
            for (int j = 0; j < colores.length; j++) {
                if(array[i].equals(colores[j])){
                    aux[cont]=array[i];
                    cont++;
                    entra = true;
                }
            }
            if(entra==false){
                aux[(aux.length)-palabras]=array[i];
                palabras--;
            }
        }

        return aux;
    }

    public static void main(String[] args) {

        String[] array = new String[8];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca palabra: ");
            array[i] = System.console().readLine();
        }

        System.out.println("Array Original:");
        imprimeTabla(array);

        System.out.println("Array Resultado:");
        imprimeTabla(posicionaColores(array));

    }
}
