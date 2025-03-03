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
        this.jenisKelamin = Boolean.parseBoolean(input.nextLine());

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
}
