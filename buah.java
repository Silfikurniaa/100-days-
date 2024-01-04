package pkg100.days;

import java.util.Scanner;

public class buah {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nama buah: ");
        String buah = in.nextLine();
        System.out.println("nama buah yang di input adalah: " + buah);
        in.close();
    }
}
