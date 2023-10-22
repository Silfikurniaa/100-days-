
package zodiak;

import java.util.Scanner;

public class Zodiak {

    public static void main(String[] args) {
        System.out.println("MENENTUKAN ZODIAK");
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan tangggal lahir anda");
        int tanggal=input.nextInt();
        int bulan=input.nextInt();
if (tanggal>31||bulan >12){
    System.out.println("input tidak dikenal");
}else{
    if(tanggal>20 && bulan==5||tanggal<21 && bulan==6){
        System.out.println("zodiak Gemini");
    }else if(tanggal >21 && bulan==12||tanggal <20 && bulan==1){
        System.out.println("zodiak Capricorn");
    }else if(tanggal >19 && bulan==1||tanggal <19 && bulan==2){
        System.out.println("zodiak Aquarius");
        }else if(tanggal >18 && bulan==2||tanggal <21 && bulan==3){
        System.out.println("zodiak Pisces");
        }else if(tanggal >20 && bulan==3||tanggal <20 && bulan==4){
        System.out.println("zodiak Aries ");
        }else if(tanggal >19 && bulan==4||tanggal <21 && bulan==5){
        System.out.println("zodiak Taurus");
        }else if(tanggal >20 && bulan==6||tanggal <23 && bulan==7){
        System.out.println("zodiak Cancer");
        }else if(tanggal >22 && bulan==7||tanggal <23 && bulan==8){
        System.out.println("zodiak Leo");
        }else if(tanggal >22 && bulan==8||tanggal <23 && bulan==9){
        System.out.println("zodiak Virgo");
        }else if(tanggal >22 && bulan==9||tanggal <23 && bulan==10){
        System.out.println("zodiak Libra");
        }else if(tanggal >22 && bulan==10||tanggal <22 && bulan==11){
        System.out.println("zodiak Scorpio");
        }else if(tanggal >21 && bulan==11||tanggal <22 && bulan==12){
        System.out.println("zodiak Sagitarius");
        }else{
            System.out.println("input tidak dikenal");
        }
    }
        
    }
    
}
