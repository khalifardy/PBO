class Prodi {
    private String nama = "";
    private String kode = "";

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        if (kode.length() == 2 && (kode.equals("IF") || kode.equals("SE") || kode.equals("IT") || kode.equals("DS"))) {
            this.kode = kode;
        } else if (kode.length() == 2) {
            System.out.println("Kode tidak ada");
        } else {
            System.out.println("Kode harus dua karakter");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}