import java.util.ArrayList;
import java.util.Scanner;
import Jurnal09.Segitiga;
import Jurnal09.BangunDatar;
import Jurnal09.Lingkaran;
import Jurnal09.PersegiPanjang;
import Jurnal09.BangunDatar;

public class DriverBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bangun Datar: ");
        int count = scanner.nextInt();
        ArrayList<BangunDatar> array_of_bangundatar = new ArrayList<>();

        

        int cnt = 1;
        while (count > 0) {
            
            System.out.println(
            "1. Lingkaran\n" +
            "2. Persegi Panjang\n" +
            "3. Segitiga Sama Kaki\n"
            );

            System.out.print("Pilih bangun datar ke-" + cnt + ": ");
            int choose = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character from the buffer
            System.out.print("Masukkan nama bangun datar: ");
            String nama = scanner.nextLine();

            if (choose == 1) {
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(nama, jariJari);
                array_of_bangundatar.add(lingkaran);
            } else if (choose == 2) {
                System.out.print("Masukkan Panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan Lebar: ");
                double lebar = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(nama, lebar, panjang);
                array_of_bangundatar.add(persegiPanjang);
            } else if (choose == 3) {
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                Segitiga segitiga = new Segitiga(nama, alas, tinggi);
                array_of_bangundatar.add(segitiga);
            }

            count--;
            cnt++;
        }

        for (BangunDatar i : array_of_bangundatar) {
            System.out.println("Nama Bangun datar: " + i.getNama());

            if (i instanceof Lingkaran) {
                System.out.println("Jari-jari: " + ((Lingkaran) i).getJariJari());
            } else if (i instanceof PersegiPanjang) {
                System.out.println("Panjang: " + ((PersegiPanjang) i).getPanjang());
                System.out.println("Lebar: " + ((PersegiPanjang) i).getLebar());
            } else if (i instanceof Segitiga) {
                System.out.println("Alas: " + ((Segitiga) i).getAlas());
                System.out.println("Tinggi: " + ((Segitiga) i).getTinggi());
            }

            System.out.println("Luas: " + i.hitungLuas());
            System.out.println("Keliling: " + i.hitungKeliling());
            System.out.println();
        }
    }
}
