
package namakontak;

public class NamaKontak {

    public static void main(String[] args) {
String [][]kontak={{"Nia", "085298496291"}, {"Amel","081234567890"},{"Rara","081298765432"}};
        for (int i = 0; i <kontak.length; i++) {
            System.out.println("nama:  "+kontak[i][0]);
            System.out.println("no.Hp: "+kontak[i][1]);
            System.out.println("_________________________");
            
        }
    }
    
}
