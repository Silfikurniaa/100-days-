package guiddp;

import javax.swing.JOptionPane;

public class Guiddp {

    public static void main(String[] args) {

        String nama, NIM, Alamat, Kelas;
        nama = JOptionPane.showInputDialog("inputkan nama anda: ");
        String a = "hello " + nama + " !";
        JOptionPane.showMessageDialog(null, a);

        NIM = JOptionPane.showInputDialog("inputkan NIM anda: ");
        String b = "NIM anda " + NIM + " !";
        JOptionPane.showMessageDialog(null, b);

        Alamat = JOptionPane.showInputDialog("inputkan Alamat anda anda: ");
        String c = "Alamat anda " + Alamat + " !";
        JOptionPane.showMessageDialog(null, c);

        
    }
}
