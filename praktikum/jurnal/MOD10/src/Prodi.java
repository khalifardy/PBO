public class Prodi {
    private String kode;
    private String nama;

    public Prodi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return this.kode;
    }

    public String getNama() {
        return this.nama;
    }
}
