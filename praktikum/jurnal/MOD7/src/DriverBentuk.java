import Jurnal07.Kubus;
import Jurnal07.Lingkaran;
import Jurnal07.PersegiPanjang;
import Jurnal07.PrismaSegi3;

public class DriverBentuk {
    public static void main(String[] args) {
        Kubus K = new Kubus("kiub", 5);
        Lingkaran L = new Lingkaran("Sirkel", 4);
        PersegiPanjang PP = new PersegiPanjang("Rektengel", 8, 9);
        PrismaSegi3 P = new PrismaSegi3("Triengelprism", 6, 7, 10);

        L.info();
        System.out.println(
            " Luas               : " + L.hitungLuas() + "\n" +
            "Keliling           : " + L.hitungKeliling()
        );

        PP.info();
        System.out.println(
            " Luas                    : " + PP.hitungLuas() + "\n" +
            "Keliling                : " + PP.hitungKeliling()
        );

        K.info();
        System.out.println(
            " Luas Permukaan : " + K.hitungLuasPermukaan() + "\n" +
            "Volume         : " + K.hitungVolume()
        );

        P.info();
        System.out.println(
            " Luas Permukaan    : " + P.hitungLuasPermukaan() + "\n" +
            "Volume            : " + P.hitungVolume()
        );
    }
}
