import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] prodcutos = new String[7];

        int total = prodcutos.length;

        prodcutos[0] = "Kingston Pendrive 64GB";
        prodcutos[1] = "Samsung Galaxy";
        prodcutos[2] = "Disco duro SSD externo";
        prodcutos[3] = "Macbook Air";
        prodcutos[4] = "Chromcast 4ta generacion";
        prodcutos[5] = "Asus notebook";
        prodcutos[6] = "Audifonos Sony";

        Arrays.sort(prodcutos);
        System.out.println("=====Usando For======");
        for (int i=0; i < total; i++){
            System.out.println("Para indice " + i + ": " + prodcutos[i]);
        }
        System.out.println("=====Usando ForEach======");
        for (String prod: prodcutos){
            System.out.println("prod = " + prod);
        }

        System.out.println("=====Usando While======");
        int i = 0;
        while(i < total){
            System.out.println("Para indice " + i + ": " + prodcutos[i]);
            i++;
        }

        int[] numeros = new int[10];
        int totalNum = numeros.length;

        for (int k=0; k < totalNum; k++){
            numeros[k] = k * 3;
        }

        for (int k=0; k < totalNum; k++){
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
