package TP6;

import java.lang.Math;

public class KoordinatLingkaran extends Koordinat {
    // Variabel instance untuk radius r
    private double r;

    // Konstruktor
    public KoordinatLingkaran(double x, double y, double r) {
        super(x, y); // Memanggil konstruktor dari superclass (Koordinat)
        this.r = r;
    }

    // Getter dan Setter untuk r
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // Metode isBersinggungan untuk memeriksa apakah dua lingkaran bersinggungan pada batas luar
    public boolean isBersinggungan(KoordinatLingkaran k) {
        // Asumsi lingkaran hanya bersinggungan di batas luar
        double jarak_pusat = super.hitungJarak(k);
        double penjumlahan = this.getR() + k.getR();
        
        if (jarak_pusat == penjumlahan) {
            return true;
        } else {
            return false;
        }
    }

}

