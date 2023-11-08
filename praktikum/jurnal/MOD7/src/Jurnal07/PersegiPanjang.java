package Jurnal07;

public class PersegiPanjang extends Bentuk implements BangunDatar {
    private final double panjang;
    private final double lebar;

    public PersegiPanjang(String nama, double panjang, double lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public void info() {
        System.out.println(
            "Nama Persegi Panjang    : " + getNama() + "\n" +
            "Panjang                 : " + panjang + "\n" +
            "Lebar                   : " + lebar
        );
    }
}

