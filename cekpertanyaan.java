package pkg100.days;

import java.util.Scanner;

public class cekpertanyaan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("masukkan kalimat : ");
        String ask = in.nextLine();
        if (ask.endsWith("?")) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }

    }

}
