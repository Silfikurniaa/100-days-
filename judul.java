/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100.days;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class judul {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> juduldramalist = new ArrayList<>();
        System.out.println("masukkan judul drama: ");
        String juduldrama = in.nextLine();
        while (!juduldrama.equalsIgnoreCase("end")) {
            juduldramalist.add(juduldrama);
            juduldrama = in.nextLine();
            System.out.println("judul drama yang dimasukkan: ");
            for (String judul : juduldramalist) {
                System.out.println(judul);
            }

        }
    }
}
