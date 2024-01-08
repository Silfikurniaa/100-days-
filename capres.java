package pkg100.days;

public class capres {

    public static void main(String[] args) {
        String[] nama = {"Anies Baswedan", "Prabowo Subianto", "Ganjar Pranowo"};
        String[] partai = {"Partai 1", "Partai 2", "Partai 3"};
        int[] usia = {54, 72, 55};
        System.out.println("Data calon Presiden: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("calon Presiden" + (1 + i) + ": ");
            System.out.println("nama: " + nama[i]);
            System.out.println("Partai: " + partai[i]);
            System.out.println("usia: " + usia[i]);
        }
    }
}
