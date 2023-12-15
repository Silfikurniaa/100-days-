package polaa;

public class Polaa {

    public static void main(String[] args) {
        String[][] nama = {
            {"silfi", "amel", "lia"},
            {"siti", "Indah", "febi"}
        };
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {

                System.out.println(nama[i][j] + " ");

            }
            System.out.println();
        }
    }
}
