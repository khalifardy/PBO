public class Mahasiswa implements Comparable<Mahasiswa> {
    private String nim;
    private String nama;
    private Prodi prodi;
    private double IPK;
    private static String lastNim; // static variable

    public Mahasiswa(String nim, String nama, Prodi prodi, double IPK) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.IPK = IPK;
        Mahasiswa.lastNim = nim; // static variable initialization
    }

    public static String getLastNim() {
        return Mahasiswa.lastNim;
    }

    public void setNim(String nim) {
        this.nim = nim;
        Mahasiswa.lastNim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi.getKode();
    }

    public double getIPK() {
        return IPK;
    }

    public void display() {
        System.out.printf("NIM : %s%n", nim);
        System.out.printf("Nama : %s%n", nama);
        System.out.printf("Prodi : %s (%s)%n", prodi.getKode(), prodi.getNama());
        System.out.printf("IPK : %.2f%n", IPK);
    }

    @Override
    public int compareTo(Mahasiswa other) {
        // Implement comparison based on IPK in descending order
        return Double.compare(other.getIPK(), this.getIPK());
    }
}
