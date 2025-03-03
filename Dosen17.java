import java.util.Scanner;

public class Dosen17 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen17(){

    }

    public Dosen17(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tambahData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Kode        : ");
        this.kode = input.nextLine();

        System.out.print("Nama        : ");
        this.nama = input.nextLine();

        System.out.print("Jenis Kelamin (Pria/Wanita): ");
        String jk = input.nextLine().trim().toLowerCase();
        this.jenisKelamin = jk.equals("pria");

        System.out.print("Usia         : ");
        this.usia = input.nextInt();

        System.out.println("-----------------------------------------");
    }
    public void cetakInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("-----------------------------------------");
    }

    public static void dataSemuaDosen(Dosen17[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen17 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen17 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                countPria++;
            } else {
                totalUsiaWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen:");
        System.out.println("Pria   : " + (countPria > 0 ? (double) totalUsiaPria / countPria : 0) + " tahun");
        System.out.println("Wanita : " + (countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0) + " tahun");
    }

    public static void infoDosenPalingTua(Dosen17[] arrayOfDosen) {
        Dosen17 tertua = arrayOfDosen[0];
        for (Dosen17 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen17[] arrayOfDosen) {
        Dosen17 termuda = arrayOfDosen[0];
        for (Dosen17 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo();
    }
}
