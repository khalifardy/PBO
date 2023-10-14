package relation;
import entity.Mahasiswa;
import entity.Matakuliah;

public class AmbilMK {
    private Matakuliah matakuliah;
    private Mahasiswa mahasiswa;
    private String nilai;
    private String tahun_ajaran;

    public AmbilMK(Matakuliah matakuliah, Mahasiswa mahasiswa, String nilai, String tahun_ajaran) {
        this.matakuliah = matakuliah;
        this.mahasiswa = mahasiswa;
        this.nilai = nilai;
        this.tahun_ajaran = tahun_ajaran;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setTahunAjaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public String getNilai() {
        return nilai;
    }

    public String getTahunAjaran() {
        return tahun_ajaran;
    }
}

