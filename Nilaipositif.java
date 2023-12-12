
package nilaipositif;

public class Nilaipositif {

    public static void main(String[] args) {
int []nilai={5,7,9,-2,-5,10,-4,8};
int count=0;
        System.out.println("nilai positif dalam array : ");
        for (int i = 0; i <nilai.length; i++) {
            if(nilai[i]>0){
                System.out.println(nilai[i]);
            }
            
        }
    }
    
}
