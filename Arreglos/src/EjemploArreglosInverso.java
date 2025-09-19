import java.util.Arrays;

public class EjemploArreglosInverso {
    public static void main(String[] args) {

//        String[] prodcutos = new String[7];
        String[] prodcutos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD externo", "Macbook Air", "Chromcast 4ta generacion", "Asus notebook", "Audifonos Sony" };
        int total = prodcutos.length;

        /*prodcutos[0] = "Kingston Pendrive 64GB";
        prodcutos[1] = "Samsung Galaxy";
        prodcutos[2] = "Disco duro SSD externo";
        prodcutos[3] = "Macbook Air";
        prodcutos[4] = "Chromcast 4ta generacion";
        prodcutos[5] = "Asus notebook";
        prodcutos[6] = "Audifonos Sony";*/

        Arrays.sort(prodcutos);
        System.out.println("=====Usando For======");
        for (int i=0; i < total; i++){
            System.out.println("Para indice " + i + ": " + prodcutos[i]);
        }
        System.out.println("=====Usando For Inverso======");
        for (int i=0; i < total; i++){
            System.out.println("Para i = " + (total - 1 - i) + " valor: " + prodcutos[total - 1 - i]);
        }
        System.out.println("=====Usando For Inverso 2======");
        for (int i= total -1; i >= 0; i--){
            System.out.println("Para i = " +  i + " valor: " + prodcutos[i]);
        }

    }
}
