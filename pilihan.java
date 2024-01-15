package pkg100.days;

import java.util.Scanner;

public class pilihan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat Datang Di Pemilihan Calon Presiden");
        System.out.println("Apakah Anda Akan  memilih Calon Presiden 01, 02, atau 03?(01/02/03");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 01:
                System.out.println("Anda memilih Calon Presiden 01");
                break;
            case 02:
                System.out.println("Anda memilih Calon Presiden 02");
                break;
            case 03:
                System.out.println("Anda memilih Calon Presiden 03");
                break;
            default:
                System.out.println("Anda Tidak Memilih Calon Presiden Manapun");

        }

    }
}
