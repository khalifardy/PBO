import TP09.Semut;
import TP09.Lebah;
import TP09.Koordinat;
import TP09.Koordinat3D;

public class DriverSerangga {
    public static void main(String[] args) throws Exception {
        Semut S = new Semut("Merah", new Koordinat(70, 90));
        S.info();
        S.gerak(new Koordinat(80, 100));

        // Membuat objek Lebah
        Lebah l = new Lebah("Oranye", new Koordinat3D(30, 40, 50));
        l.info();
        l.gerak(new Koordinat3D(45, 55, 65));
    }
}
