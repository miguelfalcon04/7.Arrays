package ArrayBidimensionales;

public class Eje10 {

    static String horizontal = "\u2550";
    static String vertical = "\u2551";
    static String esquinaSupIzq = "\u2554";
    static String esquinaSupDer = "\u2557";
    static String esquinaInfIzq = "\u255A";
    static String esquinaInfDer = "\u255D";
    static String medio = "\u256C";
    static String medioArriba = "\u2566";
    static String medioAbajo = "\u2569";
    static String medioDer = "\u2563";
    static String medioIzq = "\u2560";

    public static void pintaTabla(int[][] array){
        int cont = 0;

        
        System.out.print(esquinaSupIzq);
        for (int i = 0; i < 11; i++) {
            if(cont!=3){
                System.out.print(horizontal);
                cont++;
            }else{
                System.out.print(medioArriba);
                cont = 0;
            }
        }
        System.out.println(esquinaSupDer);

        for (int i = 0; i < 5; i++) {

            if(i%2==0){
                for (int j = 0; j < 13; j++) {
                    if(cont!=3){
                        System.out.print(" ");
                        cont++;
                    }else{
                        System.out.print(vertical);
                        cont = 0;
                    }
                }
            }else{
                for (int j = 0; j < 13; j++) {
                    if(j==0){
                        System.out.print(medioIzq);
                        break;kgqrgqurig
                    }
                    if(cont!=3){
                        System.out.print(horizontal);
                        cont++;
                    }else{
                        System.out.print(medio);
                        cont = 0;
                    }
                    if(j==12){
                        System.out.print(medioDer);
                    }
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        pintaTabla(array);
        
    }
}
