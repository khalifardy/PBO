package Jurnal09;

public class Lingkaran extends BangunDatar {
    // Atribut
    private double jariJari;
    private final double pi = Math.PI; // final attribute

    // Konstruktor
    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    // Getter untuk jari-jari
    public double getJariJari() {
        return this.jariJari;
    }

    // Setter untuk jari-jari
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Override metode hitungKeliling dari kelas BangunDatar
    @Override
    public double hitungKeliling() {
        return 2 * this.pi * this.jariJari;
    }

    // Override metode hitungLuas dari kelas BangunDatar
    @Override
    public double hitungLuas() {
        return this.pi * Math.pow(this.jariJari, 2);
    }
}
