package Jurnal07;

public class Bentuk {
    private String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }
}
