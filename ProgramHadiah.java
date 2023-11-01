
package programhadiah;

import java.util.Scanner;

public class ProgramHadiah {

    public static void main(String[] args) {
int belanja=0;
Scanner sc=new Scanner(System.in);
        System.out.println("total belanjaan: Rp ");
        belanja= sc.nextInt();
        if (belanja>100000){
            System.out.println("Selamat, anda mendapatkan hadiah!");
            System.out.println("Terima Kasih Telah Berbelanja di Toko Kami");
        }

    }
    
}
