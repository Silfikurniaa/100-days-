
package pkg100.days;

import java.util.Scanner;

public class domisili {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan Nama anda: ");
        String nama=in.nextLine();
        System.out.println("Masukkan Alamat Lama Anda: ");
        String Alamatlama=in.nextLine();
        System.out.println("masukkan Alamat Baru Anda: ");
        String alamatbaru=in.nextLine();
        System.out.println("--------------------------");
        System.out.println("INFORMASI PINDAH DOMISILI ");
        System.out.println("Nama: "+nama);
        System.out.println("Domisili sebelumnya: "+Alamatlama);
        System.out.println("Domisili Sekarang: "+alamatbaru);
    }
}
