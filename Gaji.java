
package gaji;

import java.util.Scanner;


public class Gaji {

    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.println("masukkan nominal gaji yang diterima : ");
        int gaji=in.nextInt();
        System.out.println("masukkan potongan gaji tiap bulan: ");
        int potongan=in.nextInt();
        int gajibersih=gaji-potongan;
        System.out.println(" gaji bersih yang diterima: "+gajibersih);
    }
    
}
