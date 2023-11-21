package menumakanan;

import java.util.Scanner;

public class MenuMakanan {

    public static void main(String[] args) {
        String menu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Menu : ");
        menu = sc.nextLine();

        switch (menu) {
            case "Mie Bakso":
                System.out.println("Rp 10.000");
                break;
            case "Mie Ayam":
                System.out.println("Rp 10.000");
                break;
            case "Mie Level":
                System.out.println(" 12.000");
                break;
            case "Nasi Ayam Geprek":
                System.out.println("13.000");
                break;
            default:
                System.out.println("menu yang di pilih tidak ada");

        }
    }

}
