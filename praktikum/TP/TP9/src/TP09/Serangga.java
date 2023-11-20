package TP09;

public class Serangga {
    private Koordinat posisi;
    private String warna;

    // Konstruktor
    public Serangga(Koordinat koordinat, String warna) {
        this.posisi = koordinat;
        this.warna = warna;
    }

    // Metode gerak
    public void gerak(Koordinat k) {
        this.posisi.setX(k.getX());
        this.posisi.setY(k.getY());
    }

    // Getter untuk posisi
    public Koordinat getPosisi() {
        return posisi;
    }

    // Getter untuk warna
    public String getWarna() {
        return warna;
    }

    // Setter untuk warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Metode info
    public void info() {
        System.out.println(
            warna + "\n" +
            "X=" + posisi.getX() + "\n" +
            "Y=" + posisi.getY()
        );
    }
}
