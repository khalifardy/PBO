package Jurnal09;

public class Segitiga extends BangunDatar {
    // Atribut
    private double alas;
    private double tinggi;

    // Konstruktor
    public Segitiga(String nama, double alas, double tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Getter untuk alas
    public double getAlas() {
        return this.alas;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return this.tinggi;
    }

    // Setter untuk alas
    public void setAlas(double alas) {
        this.alas = alas;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Override metode hitungKeliling dari kelas BangunDatar
    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(0.5 * this.alas, 2) + Math.pow(this.tinggi, 2));
        return 2 * sisiMiring + this.alas;
    }

    // Override metode hitungLuas dari kelas BangunDatar
    @Override
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }
}

