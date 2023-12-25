
package pkg100.days;
import java.util.Scanner;
public class perulangann {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int total=0;
        System.out.println("masukkan batas nilai: ");
        int batas=in.nextInt();
        for (int i = 0; i <=batas; i++) {
            System.out.println(i);
            total+=i;
            if(i<batas){
                System.out.println("+");
            }else{
                System.out.println("=");
                System.out.println(total);
            }
        }
        System.out.println();
            
    }
  
}
