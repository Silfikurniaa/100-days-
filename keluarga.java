
import java.util.Scanner;

public class keluarga {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah anggota keluarga: ");
        int jumlahAnggota = in.nextInt();
        String[]namaAnggota = new String[jumlahAnggota];
        int[] usiaAnggota = new int[jumlahAnggota];
        for (int i = 0; i < jumlahAnggota; i++) {
            System.out.println("Anggota keluarga ke-"+(i + 1));
            System.out.print("Masukkan nama: ");
            namaAnggota[i] = in.next();
            System.out.print("Masukkan usia: ");
            usiaAnggota[i] = in.nextInt();
        }
        System.out.println("\nDaftar anggota keluarga:");
        for (int i = 0; i < jumlahAnggota; i++) {
            System.out.println("Nama: " + namaAnggota[i] + ", Usia: " + usiaAnggota[i]);
        }

    }
}
