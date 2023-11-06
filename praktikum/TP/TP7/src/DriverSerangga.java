import TP07.Lebah;
import TP07.Semut;

public class DriverSerangga {
    public static void main(String[] args) {
        Semut S = new Semut("Hitam", 60, 80);
        System.out.println("Warna Semut : " + S.getWarna());
        S.info();
        S.gerak(new int[]{70, 90});
        S.info();

        Lebah L = new Lebah(20, 30, 40, "Kuning");
        System.out.println("Warna Lebah : " + S.getWarna());
        L.info();
        L.terbang(55, 65, 75);
        L.info();
        L.gerak(new int[]{25, 35, 45});
        L.info();
    }
}
