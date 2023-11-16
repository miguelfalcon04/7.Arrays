/*Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
*/

public class Eje02 {
    public static void main(String[] args) {

        char[] c = new char[10];
        c[0] = 'a';
        c[1] = 'x';
        c[4] = '@';
        c[6] = ' ';
        c[7] = '+';
        c[8] = 'Q';

        for (char d : c) {
            System.out.print(d+" ");
        } 

    }
}
