package pengukurantb.dan.bb;

import java.util.Scanner;

public class PengukuranTBDanBB {

    public static void main(String[] args) {
        double tb, bb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Berat badan ");
        bb = sc.nextDouble();
        System.out.print("tinggi badan");
        tb = sc.nextDouble();
        System.out.println("Berat badan anda " + bb);
        System.out.println("tinggi badan anda " + tb);
        System.out.println("BMI= " + bb / (tb * tb));
    }

}
