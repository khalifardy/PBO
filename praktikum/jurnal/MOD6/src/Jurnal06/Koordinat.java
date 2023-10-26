package Jurnal06;

import java.lang.Math;

public class Koordinat {
    // Variabel instance untuk koordinat x dan y
    private double x;
    private double y;

    // Konstruktor
    public Koordinat(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter dan Setter untuk x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getter dan Setter untuk y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Metode hitungJarak untuk menghitung jarak antara dua objek Koordinat
    public double hitungJarak(Koordinat k) {
        double delta_x = Math.pow(this.getX() - k.getX(), 2);
        double delta_y = Math.pow(this.getY() - k.getY(), 2);
        double jarak = Math.sqrt(delta_x + delta_y);
        return jarak;
    }

}

