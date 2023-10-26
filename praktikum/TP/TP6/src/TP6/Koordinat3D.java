package TP6;

import java.lang.Math;

public class Koordinat3D extends Koordinat {
    // Variabel instance untuk koordinat z
    private double z;

    // Konstruktor
    public Koordinat3D(double x, double y, double z) {
        super(x, y); // Memanggil konstruktor dari superclass (Koordinat)
        this.z = z;
    }

    // Getter dan Setter untuk z
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Metode hitungJarak untuk menghitung jarak antara dua objek Koordinat3D
    public double hitungJarak(Koordinat3D k) {
        double delta_x = Math.pow(this.getX() - k.getX(), 2);
        double delta_y = Math.pow(this.getY() - k.getY(), 2);
        double delta_z = Math.pow(this.getZ() - k.getZ(), 2);
        double jarak = Math.sqrt(delta_x + delta_y + delta_z);
        return jarak;
    }

   
}