package pkg100.days;

import java.util.Scanner;

public class invest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan investasi awal: ");
        double investAwal = in.nextDouble();
        System.out.println("masukkan tingkat pengembalian tahunan (%)");
        double tingkatKembali = in.nextDouble();
        System.out.println("masukkan jangka waktu(tahun): ");
        int waktu = in.nextInt();
        double untung = investAwal * (tingkatKembali / 100) * waktu;
        double nilaiAkhir = investAwal + untung;
        System.out.println("keuntungan investasi anda setelah " + waktu + " tahun adalah: " + untung);
        System.out.println("nilai akhir investasi anda setelah " + waktu + "tahun adalah: " + nilaiAkhir);
        in.close();
    }
}
