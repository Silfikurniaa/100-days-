package bufferreader1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader1 {

    public static void main(String[] args)
throws IOException {
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
        String nama;
        System.out.println("masukkan nama: ");
        nama= br.readLine();
        String alamat;
        System.out.println("masukkan alamat:");
        alamat=br.readLine();
        System.out.println("nama saya adalah " +nama+ " dan alamat saya di " +alamat);
       
    }
    
}
