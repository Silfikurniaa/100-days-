package pkg100.days;

public class perulangan3tipe {

    public static void main(String[] args) {
        int[] angka = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        System.out.println("menggunakan for: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        System.out.println();

        System.out.println("menggunakan for-each: ");
        for (int nomor : angka) {
            System.out.println(nomor);
        }
        System.out.println();

        System.out.println("menggunakan while: ");
        int j = 0;
        while (j < angka.length) {
            System.out.println(angka[j]);
            j++;
        }
        System.out.println();

    }

}
