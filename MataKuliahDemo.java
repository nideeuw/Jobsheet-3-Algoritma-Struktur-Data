import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        MataKuliah17[] arrayOfMataKuliah = new MataKuliah17[jumlahMataKuliah];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            
            arrayOfMataKuliah[i] = new MataKuliah17();
            arrayOfMataKuliah[i].tambahData();
        }
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
