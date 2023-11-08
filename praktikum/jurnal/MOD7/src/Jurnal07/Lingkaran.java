package Jurnal07;

public class Lingkaran extends Bentuk implements BangunDatar {
    private final double jariJari;
    private final double pi = 3.14; // final attribute

    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jariJari * pi;
    }

    @Override
    public double hitungLuas() {
        return pi * Math.pow(jariJari, 2);
    }

    @Override
    public void info() {
        System.out.println(
            "Nama Lingkaran     : " + getNama() + "\n" +
            "Panjang jari-jari  : " + jariJari
        );
    }
}

