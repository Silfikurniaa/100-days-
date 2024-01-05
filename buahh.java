package pkg100.days;

import java.util.Scanner;

public class buahh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("banyak buah yang akan di input: ");
        int jumlahbuah = in.nextInt();
        in.nextLine();
        String[] buah = new String[jumlahbuah];
        for (int i = 0; i < jumlahbuah; i++) {
            System.out.print("input nama buah ke " + (i + 1) + ":");
            buah[i] = in.nextLine();
        }
        System.out.println("Buah yang di input adalah: ");
        for (String namabuah : buah) {
            System.out.println(namabuah);

        }
    }
}
