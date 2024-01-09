package pkg100.days;

import java.util.Scanner;

public class TernaryGanjilGenap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int angka = in.nextInt();
        String hasil = (angka % 2 == 0) ? "BIlangan Genap" : "Bilangan Ganjil";
        System.out.println(hasil);
        in.close();

    }
}
