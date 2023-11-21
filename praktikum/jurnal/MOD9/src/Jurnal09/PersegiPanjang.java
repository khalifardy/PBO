package Jurnal09;

public class PersegiPanjang extends BangunDatar {
    // Atribut
    private double lebar;
    private double panjang;

    // Konstruktor
    public PersegiPanjang(String nama, double lebar, double panjang) {
        super(nama);
        this.lebar = lebar;
        this.panjang = panjang;
    }

    // Getter untuk lebar
    public double getLebar() {
        return this.lebar;
    }

    // Getter untuk panjang
    public double getPanjang() {
        return this.panjang;
    }

    // Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Override metode hitungKeliling dari kelas BangunDatar
    @Override
    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    // Override metode hitungLuas dari kelas BangunDatar
    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }
}
