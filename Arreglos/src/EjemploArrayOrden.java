public class EjemploArrayOrden {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int total = numeros.length;

        for(int i=0; i < total; i++){
            numeros[i] = i +1;
        }
        for (int i=0; i < total/2; i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[total - 1 - i]);
        }
    }

}
