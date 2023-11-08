package Jurnal07;

public class Kubus extends Bentuk implements BangunRuang {
    private final double sisi;

    public Kubus(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.pow(sisi, 2) * 6;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public void info() {
        System.out.println(
            "Nama Kubus     : " + getNama() + "\n" +
            "Panjang Sisi   : " + sisi
        );
    }
}

