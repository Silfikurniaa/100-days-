
package aritmatikapengurangan;

import java.util.Scanner;

public class AritmatikaPengurangandanperkalian {

    public static void main(String[] args) {
int angka;
int angka1;
int hasil;
Scanner sc = new Scanner(System.in);
        System.out.println("Input angka-1: ");
        angka =sc.nextInt();
        System.out.println("Input angka-2: ");
        angka1=sc.nextInt();
        hasil= angka -angka1;
        System.out.println("hasil= "+hasil);
         System.out.println("Input angka-1: ");
        angka =sc.nextInt();
        System.out.println("Input angka-2: ");
        angka1=sc.nextInt();
        hasil=angka*angka1;
                System.out.println("hasil="+hasil);
    }
    
}
