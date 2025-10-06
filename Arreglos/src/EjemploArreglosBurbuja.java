import java.util.Arrays;

public class EjemploArreglosBurbuja {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i=0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 -i];
            arreglo[i] = inverso;
            arreglo[total - 1 -i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] prodcutos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD externo", "Macbook Air", "Chromcast 4ta generacion", "Asus notebook", "Audifonos Sony" };
        int total = prodcutos.length;

        int contador = 0;
//        for (int i=0; i < total; i++){
//            for (int j=0; j < total; j++){
//                if (prodcutos[i].compareTo(prodcutos[j]) < 0){
//                    String auxiliar = prodcutos[i];
//                    prodcutos[i] = prodcutos[j];
//                    prodcutos[j] = auxiliar;
//                }
//                contador ++;
//            }
//        }
        for (int i=0; i < total - 1; i++){
            for (int j=0; j < total - 1 - i; j++){
                if (prodcutos[j+1].compareTo(prodcutos[j]) < 0){
                    String auxiliar = prodcutos[j];
                    prodcutos[j] = prodcutos[j+1];
                    prodcutos[j+1] = auxiliar;
                }
                contador ++;
            }
        }
        System.out.println("Contado = " + contador);
//        Arrays.sort(prodcutos);
//        arregloInverso(prodcutos);
//        Collections.reverse(Arrays.asList(prodcutos));

        System.out.println("=====Usando For======");
        for (int i=0; i < total; i++){
            System.out.println("Para indice " + i + ": " + prodcutos[i]);
        }

//        Integer[] numeros = new Integer[4];
        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 35;
        numeros[2] = 22;
        numeros[3] = 4;

        for (int i=0; i < numeros.length - 1; i++){
            for (int j=0; j < numeros.length - 1 - i; j++){
                if ( ((Integer) numeros[j+1]).compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador ++;
            }
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
