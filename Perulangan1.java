
package perulangan1;

import java.util.Scanner;

public class Perulangan1 {

    public static void main(String[] args) {
String[]buah= new String[5];
Scanner sc=new Scanner(System.in);
        for (int i = 0; i < buah.length; i++) {
            System.out.println("buah ke- "+ i +":");
            buah[i]=sc.nextLine();
            System.out.println("---------------");
            for(String b: buah){
                System.out.println(b);
            }
            
        }

    }
    
}
