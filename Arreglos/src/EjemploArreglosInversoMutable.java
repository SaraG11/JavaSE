import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosInversoMutable {

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

        Arrays.sort(prodcutos);

        arregloInverso(prodcutos);
//        Collections.reverse(Arrays.asList(prodcutos));
        System.out.println("=====Usando For======");
        for (int i=0; i < total; i++){
            System.out.println("Para indice " + i + ": " + prodcutos[i]);
        }
    }
}
