package com.tutorial;

// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;


}

public class Main{

    public static void main(String[] args) throws Exception{
        // instansiasi / create object
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = "Miko";
        mahasiswa1.NIM = "01304211035";
        mahasiswa1.jurusan = "Teknik Fisika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 31;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        
    }
}