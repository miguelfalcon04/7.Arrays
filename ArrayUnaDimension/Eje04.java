package ArrayUnaDimension;
/*Ejercicio 4
Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
*/

public class Eje04 {
    public static void main(String[] args) {

        long[] numero = new long[20];
        long[] cuadrado = new long[20];
        long[] cubo = new long[20];

        for(int i=0; i<20; i++){
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = (long)Math.pow(numero[i], 2);
            cubo[i] = (long)Math.pow(numero[i], 3);

            System.out.printf("| %3d | %5d | %7d |\n",numero[i],cuadrado[i],cubo[i]);
        }

    }
}
