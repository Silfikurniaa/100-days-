package pkg100.days;

import java.util.Scanner;

public class temadebat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan tema debat: ");
        String Tema = in.nextLine();
        System.out.print("masukkan argumen pro: ");
        String pro = in.nextLine();
        System.out.print("Masukkan argumen kontra: ");
        String kontra = in.nextLine();
        System.out.println("tema Debat yang dipilih adalah : " + Tema);
        System.out.println("hasil debat: ");
        System.out.println("argumen Pro: " + pro);
        System.out.println("Argumen Kontra: " + kontra);
    }
}
