
package jumlah.hari.danbulan;

import java.util.Scanner;
public class JumlahHariDanbulan {
    public static void main(String[] args) {
Scanner input =new Scanner (System.in);
        System.out.println("masukkan jumlah hari");
        int jumlahHari= input.nextInt();
int jumlahBulan = jumlahHari /30;
        System.out.println("jumlah bulan dalam "+jumlahHari+ "hari adalah: "+jumlahBulan+ "bulan");    }
    
}
