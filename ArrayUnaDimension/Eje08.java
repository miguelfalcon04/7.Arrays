package ArrayUnaDimension;
/*Ejercicio 8
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
*/

public class Eje08 {
    public static void main(String[] args) {

        int[] mes = new int[12];

        System.out.println("Empezando por Enero vaya introduciendo la temperatura de cada mes");
        for(int i=0; i<mes.length; i++){
            System.out.printf("%2d: ",(i+1));
            mes[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();

        for(int i=0; i<mes.length; i++){
            System.out.printf("%2d: ",(i+1));
            for(int j=0; j<mes[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
