package pkg100.days;

import java.util.Scanner;

public class segitiga {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah;
        System.out.println("masukkan angka : ");
        jumlah = in.nextInt();
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
