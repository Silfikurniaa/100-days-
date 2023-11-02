
package kelulusan;

import java.util.Scanner;

public class Kelulusan {

    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Nama: ");
        nama=sc.nextLine();
        System.out.println("nilai: ");
        nilai=sc.nextInt();
                if (nilai>=75){
                    System.out.println("Selamat " +nama+" ,anda dinyatakan lulus!");
                }else{
                    System.out.println("Mohon Maaf " +nama+ " ,anda dinyatakan tidak lulus ");
                }
    }
    
}
