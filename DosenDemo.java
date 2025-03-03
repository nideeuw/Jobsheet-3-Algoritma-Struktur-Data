import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = input.nextInt();

        Dosen17[] daftarDosen = new Dosen17[jumlahDosen];

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            
            daftarDosen[i] = new Dosen17();
            daftarDosen[i].tambahData();
        }
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            daftarDosen[i].cetakInfo();
        }
        Dosen17.dataSemuaDosen(daftarDosen);
        Dosen17.jumlahDosenPerJenisKelamin(daftarDosen);
        Dosen17.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        Dosen17.infoDosenPalingTua(daftarDosen);
        Dosen17.infoDosenPalingMuda(daftarDosen);
    }
}
