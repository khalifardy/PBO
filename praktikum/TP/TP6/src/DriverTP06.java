import TP6.Koordinat;
import TP6.Koordinat3D;
import TP6.KoordinatLingkaran;

public class DriverTP06 {
    public static void main(String[] args) throws Exception {
        Koordinat A = new Koordinat(30, 24);
        Koordinat3D B = new Koordinat3D(20, 14, 15);

        // Perhitungan jarak antara A dan B
        double jarakAB = A.hitungJarak(B);
        System.out.println("Jarak antara A dan B: " + jarakAB);

        // Objek C
        Koordinat3D C = new Koordinat3D(22, 52, 64);

        // Perhitungan jarak antara C dan B
        double jarakCB = C.hitungJarak(B);
        System.out.println("Jarak antara C dan B: " + jarakCB);

        // Objek D dan E
        KoordinatLingkaran D = new KoordinatLingkaran(70, 120, 25.5);
        KoordinatLingkaran E = new KoordinatLingkaran(50, 100, 65.2);

        // Perhitungan jarak antara D dan E
        double jarakDE = D.hitungJarak(E);
        System.out.println("Jarak antara D dan E: " + jarakDE);
    }
}
