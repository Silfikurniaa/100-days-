package pkgdo.pkgwhile;

public class DoWhile {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 3 == 0) {
                System.out.println("Informatika" +i);
            }
            i++;
        } while (i < 15);
    }
}
