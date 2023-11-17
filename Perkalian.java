
package perkalian;

import java.util.Scanner;

public class Perkalian {

    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.println("perkalian");
        System.out.println("masukkan angka: ");
        int angka= in.nextInt();
        System.out.println("perkalian " +angka);
        for (int i = 0; i < 10; i++) {
            System.out.println(angka + " x " + (i+1) +  " = " +angka*(i+1) );
            
        }
    }
    
}
