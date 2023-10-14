package entity;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import relation.AmbilMK;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int nokelas;
    private String prodi;
    private String kelas;
    private String angkatan = "1";

    private static final Map<String, String> daftar_prodi = new HashMap<>();
    static {
        daftar_prodi.put("1301", "IF");
        daftar_prodi.put("1302", "SE");
        daftar_prodi.put("1303", "IT");
        daftar_prodi.put("1305", "DS");
    }

    public Mahasiswa(String nama, String nim, int nokelas) {
        this.nama = nama;
        this.nim = nim;
        this.nokelas = nokelas;

        try {
            this.prodi = daftar_prodi.get(nim.substring(0, 4));
        } catch (Exception e) {
            this.prodi = "";
        }

        int tahun_angkatan = Integer.parseInt(nim.substring(4, 6));

        if (tahun_angkatan < 76) {
            tahun_angkatan += 2000;
        } else {
            tahun_angkatan += 1900;
        }

        if (tahun_angkatan != 1976) {
            this.angkatan = String.valueOf(tahun_angkatan - 1976);
        }

        if (this.nokelas < 10) {
            this.kelas = String.format("%s-%s-0%d", this.prodi, this.angkatan, this.nokelas);
        } else {
            this.kelas = String.format("%s-%s-%d", this.prodi, this.angkatan, this.nokelas);
        }
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(int nokelas) {
        this.nokelas = nokelas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public double hitungIPK(List<AmbilMK> ambilMK, String tahun_ajaran) {
        Map<String, Double> indeks = new HashMap<>();
        indeks.put("A", 4.0);
        indeks.put("AB", 3.5);
        indeks.put("B", 3.0);
        indeks.put("BC", 2.5);
        indeks.put("C", 2.0);
        indeks.put("D", 1.0);
        indeks.put("E", 0.0);

        double totalNilai = 0.0;
        int totalSks = 0;

        for (AmbilMK mk : ambilMK) {
            if (mk.getTahunAjaran().equals(tahun_ajaran) && mk.getMahasiswa().getNim().equals(this.nim)) {
                totalNilai += mk.getMatakuliah().getSks() * indeks.get(mk.getNilai());
                totalSks += mk.getMatakuliah().getSks();
            }
        }

        if (totalSks != 0) {
            return totalNilai / totalSks;
        } else {
            return -1.0;
        }
    }
}
