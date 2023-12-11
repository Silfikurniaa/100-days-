
package menentukannilaitinggirendah;
import java.util.Arrays;
public class Menentukannilaitinggirendah {

    public static void main(String[] args) {
        
int nilai[]={5,8,1,50,3,-1};
        System.out.println(Arrays.toString(nilai));
        int nilaiTinggi=nilai[0];
        for (int i = 0; i <nilai.length; i++) {
            if(nilai[i]>nilai.length){nilaiTinggi=nilai[i];
            }
        }
        System.out.println("Nilai tertinggi dalam array adalah "+ nilaiTinggi);
        int nilaiKecil=nilai[0];
        for (int i = 0; i <nilai.length; i++) {
            nilaiKecil=nilai[i];
        }
        System.out.println("nilai terkecil dalam array adalah "+nilaiKecil);
            
        }
            
        }
    
    

