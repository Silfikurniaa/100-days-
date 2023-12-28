package pkg100.days;

public class arraay2d {

    public static void main(String[] args) {
        int[][] nilai = {
            {50, 60, 70, 78, 80},
            {20, 65, 0, 90, 89, 75}
        };
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] >= 75) {
                    System.out.println("selamat nilai kamu mencukupi untuk ke babak selanjutnya, nilai kamu adalah " + nilai[i][j]);
                }
            }
        }
    }
}
