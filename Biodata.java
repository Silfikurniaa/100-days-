
package biodata;

import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
String nama;
String alamat;
String kelas;
String nim;
double tb;
float bb;
        System.out.println("nama: ");
        nama= sc.nextLine();
        System.out.println("alamat: ");
        alamat= sc.nextLine();
        System.out.println("kelas: ");
        kelas= sc.nextLine();
        System.out.println("nim: ");
        nim=sc.nextLine();
        System.out.println("tinggi badan: ");
        tb= sc.nextDouble();
        System.out.println("berat badan: ");
        bb=sc.nextFloat();
        System.out.println("Nama saya adalah " +nama+" beralamatkan di "+alamat+
                " kelas " +kelas+ " dengan Nim " +nim+
                " tinggi badan saya "+tb+" dan berat badan "+bb);
    }
    
}
