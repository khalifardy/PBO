package Jurnal07;

public class PrismaSegi3 extends Bentuk implements BangunRuang {
    private final double alas;
    private final double tinggi;
    private final double tinggiPrisma;

    public PrismaSegi3(String nama, double alas, double tinggi, double tinggiPrisma) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 3 * alas * tinggiPrisma + alas * tinggi;
    }

    @Override
    public double hitungVolume() {
        return alas * tinggi * tinggiPrisma * 0.5;
    }

    @Override
    public void info() {
        System.out.println(
            "Nama Prisma       : " + getNama() + "\n" +
            "Alas Segitiga     : " + alas + "\n" +
            "Tinggi Segitiga   : " + tinggi + "\n" +
            "Tinggi Prisma     : " + tinggiPrisma
        );
    }
}

