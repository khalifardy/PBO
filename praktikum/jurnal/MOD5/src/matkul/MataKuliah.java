package matkul;
import dos.Dosen;

public class MataKuliah {
    private String nama;
    private String code;
    private int sks;
    private String tipe;
    private Dosen dosen;

    public MataKuliah(String nama, String code, int sks, String tipe) {
        this.nama = nama;
        this.code = code;
        this.sks = sks;
        this.tipe = tipe;
        this.dosen = null;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public String getCode() {
        return code;
    }

    public int getSks() {
        return sks;
    }

    public void addDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void infoMataKuliah() {
        System.out.println("Matakuliah: " + nama);
        System.out.println("Code: " + code);
        System.out.println("Sks: " + sks);
        System.out.println("Dosen: " + (dosen != null ? dosen.getNama() : "Tidak ada dosen yang ditetapkan"));
    }
}

