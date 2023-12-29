package pkg100.days;

public class polapiramid {

    public static void main(String[] args) {
        int pola = 10;
        int spasi = pola - 1;
        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print(" ");
            }
            spasi--;
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
