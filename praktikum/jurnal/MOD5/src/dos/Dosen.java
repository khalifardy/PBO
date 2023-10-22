package dos;

import java.util.ArrayList;
import matkul.MataKuliah;



public class Dosen {
    private String nama;
    private String codeDosen;
    private ArrayList<MataKuliah> listMataKuliahAjar;

    public Dosen(String nama, String codeDosen) {
        this.nama = nama;
        this.codeDosen = codeDosen;
        this.listMataKuliahAjar = new ArrayList<>();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setCode(String codeDosen) {
        this.codeDosen = codeDosen;
    }

    public String getNama() {
        return nama;
    }

    public String getCode() {
        return codeDosen;
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        listMataKuliahAjar.add(mataKuliah);
    }

    public void printMataKuliahAjar() {
        for (MataKuliah mataKuliah : listMataKuliahAjar) {
            System.out.println("Matakuliah: " + mataKuliah.getNama());
            System.out.println("Code: " + mataKuliah.getCode());
            System.out.println("Sks: " + mataKuliah.getSks());
        }
    }
}
