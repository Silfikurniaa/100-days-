
package pkg100.days;

import java.util.Scanner;

public class nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah mahasiswa: ");
        int jumlahmhs = input.nextInt();
        String[] namamhs = new String[jumlahmhs];
        double[] nilaimhs = new double[jumlahmhs];
        for (int i = 0; i < jumlahmhs; i++) {
            System.out.println("masukkan nama mahasiswa ke- " + (i + 1) + ": ");
            namamhs[i] = input.next();
            System.out.println("masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilaimhs[i] = input.nextDouble();
        }
        System.out.println("\n DAFTAR NILAI MAHASISWA: ");
        for (int i = 0; i < jumlahmhs; i++) {
            System.out.println("nama: " + namamhs[i] + "nilai: " + nilaimhs[i]);
        }

    }
}
