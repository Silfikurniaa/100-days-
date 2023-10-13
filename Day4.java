
package day5;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
        System.out.println("masukkan gaji:");
       double gaji=input.nextDouble ();
        System.out.println("gaji" + gaji);
        if (gaji<= 5000000){
         System.out.println("pajak 5%");
        }else if (gaji>= 6000000) {
       System.out.println("pajak 10%");}
        
    }
    
}
