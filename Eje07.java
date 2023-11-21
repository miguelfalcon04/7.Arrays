/*Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
*/

public class Eje07 {
    public static void main(String[] args) {

        int[] aleatorios = new int[100];

        for(int i=0; i<aleatorios.length; i++){
            aleatorios[i] = (int)(Math.random()*21);
            System.out.print(aleatorios[i]+" ");
        }

        System.out.println();
        System.out.print("¿Que valor desea cambiar?: ");
        int cambiar = Integer.parseInt(System.console().readLine());
        System.out.print("¿Qué valor lo sustituirá?: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.println();

        for(int i=0; i<aleatorios.length; i++){
            if(aleatorios[i]==cambiar){
                aleatorios[i]=valor;
                System.out.print("*"+aleatorios[i]+"* ");
            }else{
                System.out.print(aleatorios[i]+" ");
            }
        }

    }
}
