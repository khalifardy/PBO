package TP07;

public class Serangga {
    private String warna;
    private final int jumlahKaki = 6;
    private int[] posisi;

    public Serangga(String warna) {
        this.warna = warna;
        posisi = new int[3]; // Initialize posisi as a 3-element array for x, y, and z
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void gerak(int[] koordinat) {
        // Check if koordinat has the correct number of elements (2 or 3)
        if (koordinat.length == 2) {
            posisi[0] = koordinat[0]; // Set X
            posisi[1] = koordinat[1]; // Set Y
        } else if (koordinat.length == 3) {
            posisi[0] = koordinat[0]; // Set X
            posisi[1] = koordinat[1]; // Set Y
            posisi[2] = koordinat[2]; // Set Z
        }
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void info() {
        if (posisi.length == 2) {
            System.out.println("X = " + posisi[0] + "\nY = " + posisi[1]);
        } else if (posisi.length == 3) {
            System.out.println("X = " + posisi[0] + "\nY = " + posisi[1] + "\nZ = " + posisi[2]);
        }
    }
}

