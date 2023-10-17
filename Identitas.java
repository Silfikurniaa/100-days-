
package identitas;

import java.util.Scanner;

public class Identitas {

   
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nama: ");
        String name = scanner.nextLine();
        System.out.print("masukkan umur: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! kamu sekarang " + age + " tahunv.");
    }
    
}
