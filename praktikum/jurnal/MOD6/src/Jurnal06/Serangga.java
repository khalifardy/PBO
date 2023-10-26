package Jurnal06;

public class Serangga {
    private String warna;
    private Koordinat koordinat;

    // Konstruktor
    public Serangga(String warna) {
        this.warna = warna;
        this.koordinat = new Koordinat(0, 0);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Koordinat getPosisi() {
        return koordinat;
    }

    public void gerak(int x, int y) {
        koordinat.setX(x);
        koordinat.setY(y);
    }
}

