public class DriverMahasiswa {
    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();
        pr1.setKode("IF");
        pr1.setNama("Teknik Informatika");
        pr2.setKode("DS");
        pr2.setNama("Sains Data");

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.setNim("1301211234");
        mhs1.setNama("Itadori Yuji");
        mhs1.setProdi(pr1);
        mhs1.setIPK(3.1);

        mhs2.setNim("1305985555");
        mhs2.setNama("Gojo Satoru");
        mhs2.setProdi(pr2);
        mhs2.setIPK(4.0);

        mhs3.setNim("13020001");
        mhs3.setNama("Toge Inumaki");
        mhs3.setProdi(pr1);
        mhs3.setIPK(3.6);

        Mahasiswa[] list_mahasiswa = {mhs1, mhs2, mhs3};

        for (int count = 0; count < list_mahasiswa.length; count++) {
            if (!list_mahasiswa[count].getProdi().getKode().equals("")) {
                System.out.println("Mahasiswa " + (count + 1));
                System.out.println("NIM: " + list_mahasiswa[count].getNim());
                System.out.println("Prodi: " + list_mahasiswa[count].getProdi().getKode() + "(" + list_mahasiswa[count].getProdi().getNama() + ")");
                System.out.println("Angkatan: " + list_mahasiswa[count].getAngkatan());
                System.out.println("IPK: " + list_mahasiswa[count].getIPK());
                System.out.println();
            }
        }
    }
}
