package TP09;

public class Lebah extends Serangga {
    private String warna;
    private Koordinat3D k;

    // Konstruktor
    public Lebah(String warna, Koordinat3D k) {
        super(k, warna);
        this.warna = warna;
        this.k = k;
    }

    // Metode gerak
    @Override
    public void gerak(Koordinat k) {
        this.k.setX(k.getX());
        this.k.setY(k.getY());

        if (k instanceof Koordinat3D) {
            this.k.setZ(((Koordinat3D) k).getZ());
        }

        System.out.println(
            "Posisi lebah : X = " + this.k.getX() + "\n" +
            "               Y = " + this.k.getY() + "\n" +
            "               Z = " + this.k.getZ() + "\n"
        );
    }

    // Metode info
    @Override
    public void info() {
        System.out.println(
            "Warna Lebah  : " + warna + "\n" +
            "Posisi lebah : X = " + k.getX() + "\n" +
            "               Y = " + k.getY() + "\n" +
            "               Z = " + k.getZ() + "\n"
        );
    }
}

