
package menumakan;
import java.util.Scanner;
public class MenuMakan {

    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.println("PILIH MENU MAKANAN ");
        System.out.println("1.nasi goreng        Rp 10.000");
        System.out.println("2.mie goreng         Rp 8.000");
        System.out.println("3.nasi ayam geprek   Rp 13.000");
        System.out.println("4.mie bakso          Rp 10.000");
        System.out.println("5.Ayam Bakar         Rp 15.000");
        System.out.println("================================");
        
        System.out.println("pilih menu 1/2/3/4/5:");
        int makanan =in.nextInt();
        System.out.println("berapa porsi: ");
        int jum_porsi=in.nextInt();
                int total_makan=0;
                String nama_makanan=null;
                switch(makanan){
                    case 1:
                        total_makan=jum_porsi*10000;
                        nama_makanan="nasi goreng";
                        System.out.println(nama_makanan+ " "+jum_porsi+" 2porsi:Rp "+total_makan);
                        break;
                        case 2:
                        total_makan=jum_porsi*8000;
                        nama_makanan="mie goreng";
                        System.out.println(nama_makanan+ " "+jum_porsi+ " porsi:Rp "+ total_makan);
                        break;
                        case 3:
                        total_makan=jum_porsi*13000;
                        nama_makanan="nasi ayam geprek";
                        System.out.println(nama_makanan+ " "+jum_porsi+"porsi:Rp "+total_makan);
                        break;
                        case 4:
                        total_makan=jum_porsi*10000;
                        nama_makanan="Mie Bakso";
                        System.out.println(nama_makanan+ " "+jum_porsi+" porsi:Rp "+total_makan);
                        break;
                        case 5:
                        total_makan=jum_porsi*15000;
                        nama_makanan="ayam bakar";
                        System.out.println(nama_makanan+ " "+jum_porsi+" porsi:Rp "+total_makan);
                        break;
                        default:
                }
    }
    
}
