package arrayy;

public class Arraay {

    public static void main(String[] args) {
        int array[] = {99, 35, 40, 75, 15, 10, 5};
        int elemenTerkecil = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < elemenTerkecil) {
                elemenTerkecil = array[i];
            }
        }
        System.out.println("elemen array terkecil : " + elemenTerkecil);
    }

}


