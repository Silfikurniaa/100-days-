package pkg100.days;

public class couple {

    public static void main(String[] args) {
        String[] nama = {"Anies Baswedan", "Prabowo Subianto", "Ganjar Pranowo"};
        String[] pasangan = {"Muhaimin Iskandar", "Gibran Rakabuming Raka", "mahfud MD"};
        String[] no = {"01", "02", "03"};
        System.out.println("Pasangan Calon Presiden");
        for (int i = 0; i < nama.length; i++) {

            System.out.println("nomor urut: " + no[i]);
            System.out.println("nama calon Presiden: " + nama[i]);
            System.out.println("nama pasangan: " + pasangan[i]);

        }
    }
}
