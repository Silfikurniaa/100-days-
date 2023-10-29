
package menghitung.luas;

import java.util.Scanner;

public class MenghitungLuas {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("masukkan panjang alas(a): ");
        int alas=input.nextInt();
        System.out.println("masukkan panjang sisi miring(b):");
        int sisimiring=input.nextInt();
        System.out.println("masukkan tinggi(h) ");
        int tinggi=input.nextInt();
        
        //menghitung luas dan keliling
        int luas= alas*tinggi;
        int keliling= (alas+sisimiring)*2;
        
        System.out.println("luas jajar genjang adalah: "+luas);
        
        System.out.println("keliling jajar genjang adalah: "+ keliling);
        
                

    }
    
}
