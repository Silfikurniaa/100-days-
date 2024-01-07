package pkg100.days;

import java.util.Scanner;

public class DATAMAHASISWA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan jumlah mahasiswa: ");
        int jmlmhs = in.nextInt();
        in.nextLine();
        int jmlMajene = 0;
        int jmlPasangkayu = 0;
        int jmlPolman = 0;
        int jmlKotaLain = 0;
        for (int i = 0; i < jmlmhs; i++) {
            System.out.println("masukkan nama mahasiswa- " + (i + 1) + ": ");
            String alamat = in.nextLine();
            if (alamat.contains("Majene")) {
                jmlMajene++;
            } else if (alamat.contains("Pasangkayu")) {
                jmlPasangkayu++;
            } else if (alamat.contains("Polman")) {
                jmlPolman++;
            } else {
                jmlKotaLain++;
            }
        }
        System.out.println("\nKategori Mahasiswa: ");
        System.out.println("majene- " + jmlMajene + "Mahasiswa");
        System.out.println("Pasangkayu- " + jmlPasangkayu + "Mahasiswa");
        System.out.println("Polman- " + jmlPolman + "Mahasiswa");
        System.out.println("kotaLain- " + jmlKotaLain + "Mahasiswa");
    }

}
