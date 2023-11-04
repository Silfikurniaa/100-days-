
package perulanganwhile;

import java.util.Scanner;

public class Perulanganwhile {

    public static void main(String[] args) {
boolean run=true;
        int counter=0;
String jawab;
Scanner sc=new Scanner(System.in);

while(run){
 System.out.println("mau keluar gak? ");
    System.out.println("jawab[ya/tidak]");
    jawab=sc.nextLine();
    if (jawab.equalsIgnoreCase("ya")){
        run= false;
                }
    counter++;
    System.out.println("anda sudah melakukan perulangan sebanyak"+ counter+ "kali");
    }
}
    }
    
