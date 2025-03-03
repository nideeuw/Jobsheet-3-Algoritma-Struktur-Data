import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dosen17[] daftarDosen = new Dosen17[3];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            
            daftarDosen[i] = new Dosen17();
            daftarDosen[i].tambahData();
        }
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            daftarDosen[i].cetakInfo();
        }
    }
}
