public class esercizio13di1 {
    public static int sommaArray(int[] array){
        int a = 0;
        for(int i = 1; i < array.length; i++){
            array[0] += array[i];
             a = array[0];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arrayNumero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int risultatoSommaArray = sommaArray(arrayNumero);
        System.out.println(risultatoSommaArray);
    }
}
