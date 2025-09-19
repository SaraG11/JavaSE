import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] prodcutos = new String[7];
        prodcutos[0] = "Kingston Pendrive 64GB";
        prodcutos[1] = "Samsung Galaxy";
        prodcutos[2] = "Disco duro SSD externo";
        prodcutos[3] = "Macbook Air";
        prodcutos[4] = "Chromcast 4ta generacion";
        prodcutos[5] = "Asus notebook";
        prodcutos[6] = "Audifonos Sony";

        Arrays.sort(prodcutos);

        String prod1 = prodcutos[0];
        String prod2 = prodcutos[1];
        String prod3 = prodcutos[2];
        String prod4 = prodcutos[3];
        String prod5 = prodcutos[4];
        String prod6 = prodcutos[5];
        String prod7 = prodcutos[6];

        System.out.println("prodcutos[0] = " + prod1);
        System.out.println("prodcutos[1] = " + prod2);
        System.out.println("prodcutos[2] = " + prod3);
        System.out.println("prodcutos[3] = " + prod4);
        System.out.println("prodcutos[4] = " + prod5);
        System.out.println("prodcutos[5] = " + prod6);
        System.out.println("prodcutos[6] = " + prod7);

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 35;
        numeros[2] = 22;
        numeros[3] = 4;

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
