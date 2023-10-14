
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import relation.AmbilMK;
import entity.Mahasiswa;
import entity.Matakuliah;

public class DriverAmbilMK {
    public static void main(String[] args) {
        Matakuliah pbo = new Matakuliah("CII384", "Pemrograman Berbasis Objek", 4);
        Matakuliah orkom = new Matakuliah("CII2A3", "Organisasi dan Arsitektur Komputer", 3);
        Matakuliah alpro = new Matakuliah("CII1F4", "Algoritma Pemrograman", 4);
        Matakuliah kwn = new Matakuliah("UKI2A2", "Kewarganegaraan", 2);

        Mahasiswa mhs1 = new Mahasiswa("Gojo Satoru", "1301091000", 1);
        Mahasiswa mhs2 = new Mahasiswa("Megumi Fushigoro", "1303195999", 12);
        Mahasiswa mhs3 = new Mahasiswa("Yuji Itadori", "1305214567", 5);

        List<AmbilMK> mk = new ArrayList<>();
        mk.add(new AmbilMK(pbo, mhs1, "A", "21/22"));
        mk.add(new AmbilMK(orkom, mhs1, "A", "09/10"));
        mk.add(new AmbilMK(alpro, mhs1, "A", "09/10"));
        mk.add(new AmbilMK(kwn, mhs1, "A", "21/22"));
        mk.add(new AmbilMK(pbo, mhs2, "B", "21/22"));
        mk.add(new AmbilMK(orkom, mhs2, "A", "19/20"));
        mk.add(new AmbilMK(alpro, mhs2, "BC", "19/20"));
        mk.add(new AmbilMK(kwn, mhs2, "AB", "21/22"));
        mk.add(new AmbilMK(pbo, mhs3, "AB", "22/23"));
        mk.add(new AmbilMK(orkom, mhs3, "D", "21/22"));
        mk.add(new AmbilMK(alpro, mhs3, "B", "21/22"));
        mk.add(new AmbilMK(kwn, mhs3, "C", "22/23"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan tahun ajaran (ketik 'q' untuk keluar program): ");
            String tahun_ajaran = scanner.nextLine();
            if (tahun_ajaran.equals("q")) {
                break;
            }

            double ipk1 = mhs1.hitungIPK(mk, tahun_ajaran);
            double ipk2 = mhs2.hitungIPK(mk, tahun_ajaran);
            double ipk3 = mhs3.hitungIPK(mk, tahun_ajaran);

            if (ipk1 != -1) {
                System.out.printf("IPK %s (%s) : %.2f%n", mhs1.getNama(), mhs1.getKelas(), ipk1);
            }

            if (ipk2 != -1) {
                System.out.printf("IPK %s (%s) : %.2f%n", mhs2.getNama(), mhs2.getKelas(), ipk2);
            }

            if (ipk3 != -1) {
                System.out.printf("IPK %s (%s) : %.2f%n", mhs3.getNama(), mhs3.getKelas(), ipk3);
            }

            if (ipk1 == -1 && ipk2 == -1 && ipk3 == -1) {
                System.out.println("Tidak ada histori pada Tahun Ajaran Ini");
            }
        }
    }
}
