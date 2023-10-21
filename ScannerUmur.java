
package scanner.umur;

import java.util.Scanner;

public class ScannerUmur {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int tanggal=input.nextInt();
int bulan=input.nextInt();
if (tanggal>31||bulan >12){
    System.out.println("tabggal lahir macam apa itu");
}else{
    if(tanggal>22 && bulan==4||tanggal<21 && bulan==5){
        System.out.println("gemini");
    }else if(tanggal >22 && bulan==5||tanggal <21&& bulan==6){
        System.out.println("pisces");
    }else{
        System.out.println("input tidak dikenal");
    }
}
    }
    
}
