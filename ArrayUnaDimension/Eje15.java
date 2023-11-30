package ArrayUnaDimension;
/*Ejercicio 15
Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:
*/

public class Eje15 {

    public static void imprimeTabla(int[] array){
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.printf("|%-9s|","Mesa nº");
        for(int i=1; i<=10; i++){
            System.out.printf("%3d |",i);
        }
        System.out.println();
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("|Ocupación|");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d |",array[i]);
        }
        System.out.println();
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    public static int mesasVacias(int[] array){
        int nadie = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                nadie++;
            }
        }
        return nadie;
    }

    public static int[] asignaHueco(int[] array, int comensales){
        int mesasVacias = mesasVacias(array);

        if(mesasVacias>0){
            for (int i = 0; i < array.length; i++) {
                if(array[i]==0){
                    array[i]+= comensales;
                    System.out.println("Por favor, sientase en la mesa número " + (i+1));
                    break;
                }
            }
        }else{
            for (int i = 0; i < array.length; i++) {
                if(array[i]+comensales<=4){
                    array[i]+=comensales;
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1));
                    break;
                }else if(i==array.length-1){
                    System.out.println("Lo siento, en estos momentos no queda sitio");
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*5);
        }
        imprimeTabla(array);

        int comensales = 0;
        do {
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            comensales = Integer.parseInt(System.console().readLine());
            imprimeTabla(asignaHueco(array, comensales));
            System.out.println();
        } while (comensales!=-1);

    }
}
