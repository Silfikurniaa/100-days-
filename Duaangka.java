
package pkg100.days;

import java.util.Scanner;

public class Duaangka {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        int angkapertama=in.nextInt();
        System.out.print("masukkan angka kedua: ");
        int angkakedua=in.nextInt();
        System.out.println("bilangan ganjil diantara "+angkapertama+" dan "+angkakedua+ " adalah ");
        for (int i = angkapertama; i < angkakedua; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
            
        }
    }
}
