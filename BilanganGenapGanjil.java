
package bilangangenapganjil;

import java.util.Scanner;

public class BilanganGenapGanjil {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("masukkan angka:");
int angka=sc.nextInt();
        
if(angka %2 ==0){
    System.out.println(angka+" adalah angka genap ");
}else{
    System.out.println(angka+" adalah angka ganjil");
}
    }
    
}
