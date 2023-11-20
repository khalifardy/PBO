package TP09;

public class Koordinat3D extends Koordinat {
    private int z;

    // Konstruktor
    public Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Getter untuk z
    public int getZ() {
        return z;
    }

    // Setter untuk z
    public void setZ(int z) {
        this.z = z;
    }
}

