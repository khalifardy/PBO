import dos.Admin;
import dos.Dosen;
import matkul.MataKuliah;
import mhs.Mahasiswa;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        MataKuliah matakuliah1 = new MataKuliah("pemrograman berbasis objek", "pbo", 4, "wajib");
        MataKuliah matakuliah2 = new MataKuliah("pembelajaran mesin", "ML", 3, "wajib");
        MataKuliah matakuliah3 = new MataKuliah("Sistem terdistribusi", "SISTER", 4, "wajib");
        MataKuliah matakuliah4 = new MataKuliah("keamanansiber", "KAMSI", 3, "wajib");
        MataKuliah matakuliah5 = new MataKuliah("Internet of things", "IOT", 3, "pilihan");
        MataKuliah matakuliah6 = new MataKuliah("Pembelajaran mesin lanjut", "MLlanjut", 3, "pilihan");

        admin.setMatakuliah(matakuliah1);
        admin.setMatakuliah(matakuliah2);
        admin.setMatakuliah(matakuliah3);
        admin.setMatakuliah(matakuliah4);
        admin.setMatakuliah(matakuliah5);
        admin.setMatakuliah(matakuliah6);

        ArrayList<MataKuliah> listMatakuliahSatuSemester = admin.getListMatakuliah();
        Dosen dosen1 = new Dosen("Miko", "mko");
        Dosen dosen2 = new Dosen("Syna", "syn");

        listMatakuliahSatuSemester.get(0).addDosen(dosen1);
        listMatakuliahSatuSemester.get(1).addDosen(dosen2);
        listMatakuliahSatuSemester.get(2).addDosen(dosen1);
        listMatakuliahSatuSemester.get(3).addDosen(dosen2);
        listMatakuliahSatuSemester.get(4).addDosen(dosen1);
        listMatakuliahSatuSemester.get(5).addDosen(dosen2);

        Mahasiswa mahasiswa = new Mahasiswa("Khalifardy", "1304211035", "Informatika");
        mahasiswa.addMataKuliahWajib(listMatakuliahSatuSemester.get(0));
        mahasiswa.addMataKuliahWajib(listMatakuliahSatuSemester.get(1));
        mahasiswa.addMataKuliahWajib(listMatakuliahSatuSemester.get(2));
        mahasiswa.addMataKuliahWajib(listMatakuliahSatuSemester.get(3));
        mahasiswa.addMataKuliahPilihan(listMatakuliahSatuSemester.get(4));
        mahasiswa.addMataKuliahPilihan(listMatakuliahSatuSemester.get(5));

        dosen1.addMataKuliah(listMatakuliahSatuSemester.get(0));
        dosen1.addMataKuliah(listMatakuliahSatuSemester.get(2));
        dosen1.addMataKuliah(listMatakuliahSatuSemester.get(4));

        dosen2.addMataKuliah(listMatakuliahSatuSemester.get(1));
        dosen2.addMataKuliah(listMatakuliahSatuSemester.get(3));
        dosen2.addMataKuliah(listMatakuliahSatuSemester.get(5));

        System.out.println(dosen1.getNama());
        dosen1.printMataKuliahAjar();

        System.out.println(dosen2.getNama());
        dosen2.printMataKuliahAjar();

        mahasiswa.infoMahasiswa();
    }
}
