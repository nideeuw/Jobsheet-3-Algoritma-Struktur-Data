import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah17[] arrayOfMataKuliah = new MataKuliah17[3];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            
            arrayOfMataKuliah[i] = new MataKuliah17();
            arrayOfMataKuliah[i].tambahData();
        }

        for(int i=0; i<3; i++){
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode    : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama    : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS     : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-----------------------------------------");
        }
    }
}
