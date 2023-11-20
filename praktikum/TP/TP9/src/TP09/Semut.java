package TP09;

public class Semut extends Serangga {
    private String warna;
    private Koordinat k;

    // Konstruktor
    public Semut(String warna, Koordinat k) {
        super(k, warna);
        this.warna = warna;
        this.k = k;
    }

    // Metode gerak
    @Override
    public void gerak(Koordinat k) {
        this.k.setX(k.getX());
        this.k.setY(k.getY());

        System.out.println(
            "Posisi Semut : X = " + this.k.getX() + "\n" +
            "               Y = " + this.k.getY() + "\n"
        );
    }

    // Metode info
    @Override
    public void info() {
        System.out.println(
            "Warna Semut  : " + warna + "\n" +
            "Posisi Semut : X = " + this.k.getX() + "\n" +
            "               Y = " + this.k.getY() + "\n"
        );
    }
}
