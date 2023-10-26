import Jurnal06.Semut;
import Jurnal06.Serangga;
import Jurnal06.Koordinat;

public class DriverJurnal06 {
    public static void main(String[] args) throws Exception {
        Serangga A = new Serangga("merah");
        System.out.printf("Posisi awal A: %d, %d%n", (int)A.getPosisi().getX(), (int)A.getPosisi().getY());

        A.gerak(40, 50);
        System.out.printf("Posisi akhir A: %d, %d%n", (int)A.getPosisi().getX(), (int)A.getPosisi().getY());

        Semut B = new Semut("hitam", 50, 80);
        System.out.printf("Posisi Sarang B: %d, %d%n", (int)B.getLokasisarang().getX(), (int)B.getLokasisarang().getY());
        System.out.printf("Posisi awal B: %d, %d%n", (int)B.getPosisi().getX(), (int)B.getPosisi().getY());

        System.out.println("Rute B: ");
        if (B.getIdxRute() == 0) {
            System.out.println("--");
        } else {
            for (Koordinat koordinat: B.getRute()) {
                System.out.printf("  %d, %d%n", (int)koordinat.getX(), (int)koordinat.getY());
            }
        }

        B.gerak(60, 100);
        B.gerak(70, 120);
        B.gerak(80, 140);

        System.out.println("Rute B: ");
        if (B.getIdxRute() == 0) {
            System.out.println("--");
        } else {
            for (Koordinat koordinat : B.getRute()) {
                System.out.printf("  %d, %d%n", (int)koordinat.getX(), (int)koordinat.getY());
            }
        }

        System.out.printf("Posisi B Saat ini: %d, %d%n", (int)B.getPosisi().getX(), (int)B.getPosisi().getY());
        B.kembaliKesarang();
        System.out.printf("Posisi B Saat ini: %d, %d%n", (int)B.getPosisi().getX(), (int)B.getPosisi().getY());
        B.kembaliKesarang();
        System.out.printf("Posisi B Saat ini: %d, %d%n", (int)B.getPosisi().getX(), (int)B.getPosisi().getY());
        B.kembaliKesarang();
        System.out.printf("Posisi B Saat ini: %d, %d%n", (int)B.getPosisi().getX(), (int)B.getPosisi().getY());
    }
}
