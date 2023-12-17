package arrayy2dimensi;

import java.util.Arrays;

public class Arrayy2dimensi {

    public static void main(String[] args) {
        int[][] nilai = {
            {22, 10, 9, -10},
            {4, 5, 6, 7}
        };
        System.out.println("menggunakan for-each");
        for (int[] baris : nilai) {
            for (int elemen : baris) {
                System.out.println(elemen + " ");

            }
            System.out.println();
        }

        System.out.println(" menggunakan kelas Arrays");
        System.out.println(Arrays.deepToString(nilai));
    }

}
