package mhs;

import java.util.ArrayList;
import matkul.MataKuliah;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private ArrayList<MataKuliah> mataKuliahWajib;
    private ArrayList<MataKuliah> mataKuliahPilihan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.mataKuliahWajib = new ArrayList<>();
        this.mataKuliahPilihan = new ArrayList<>();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void addMataKuliahWajib(MataKuliah mataKuliah) {
        if (mataKuliahWajib.size() <= 4) {
            if (mataKuliah.getTipe().equals("wajib")) {
                mataKuliahWajib.add(mataKuliah);
            } else {
                System.out.println("Matakuliah bukan mata kuliah wajib");
            }
        } else {
            System.out.println("Mata kuliah wajib sudah penuh");
        }
    }

    public void addMataKuliahPilihan(MataKuliah mataKuliah) {
        if (mataKuliahPilihan.size() <= 2) {
            if (mataKuliah.getTipe().equals("pilihan")) {
                mataKuliahPilihan.add(mataKuliah);
            } else {
                System.out.println("Matakuliah bukan mata kuliah pilihan");
            }
        } else {
            System.out.println("Mata kuliah pilihan sudah penuh");
        }
    }

    public void removeMataKuliah(MataKuliah mataKuliah) {
        if (mataKuliahPilihan.contains(mataKuliah)) {
            mataKuliahPilihan.remove(mataKuliah);
        }
        if (mataKuliahWajib.contains(mataKuliah)) {
            mataKuliahWajib.remove(mataKuliah);
        }
    }

    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);

        System.out.println("Matakuliah:");

        int count = 0;
        int sks = 0;

        for (MataKuliah mk : mataKuliahWajib) {
            System.out.println((count + 1) + ". MataKuliah: " + mk.getNama());
            System.out.println("Dosen: " + mk.getDosen().getCode());
            System.out.println(mk.getSks() + " sks");
            sks += mk.getSks();
            count++;
        }

        for (MataKuliah mk : mataKuliahPilihan) {
            System.out.println((count + 1) + ". MataKuliah: " + mk.getNama());
            System.out.println("Dosen: " + mk.getDosen().getCode());
            System.out.println(mk.getSks() + " sks");
            sks += mk.getSks();
            count++;
        }

        System.out.println("Total sks: " + sks + " sks");
    }
}

