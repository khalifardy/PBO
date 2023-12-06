import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa extends Exception {
    private String nim = "";
    private String nama = "";
    private Date tglLahir = null;
    private float IPK = 0;

    public void setNim(String nim) throws Exception {
        if (nim.length() == 0) {
            throw new Exception("Nim tidak boleh kosong");
        } else if (nim.length() < 10) {
            throw new Exception("Nim harus 10 digit");
        } else {
            try {
                Integer.parseInt(nim);
                this.nim = nim;
                System.out.println("NIM valid");
            } catch (NumberFormatException e) {
                throw new Exception("Nim harus semua angka");
            }
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) throws Exception {
        if (nama.length() < 8 && nama.length() > 0) {
            throw new Exception("Nama Minimal 8 Karakter");
        } else if (nama.length() == 0) {
            throw new Exception("Nama tidak boleh kosong");
        } else {
            this.nama = nama;
            System.out.println("Nama Valid");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setTglLahir(String tgl) throws Exception {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.tglLahir = dateFormat.parse(tgl);
            System.out.println("Tanggal lahir valid");
        } catch (ParseException e) {
            throw new Exception("Format tanggal harus yyyy-MM-dd");
        }
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setIPK(float ipk) throws Exception {
        if (ipk < 0 || ipk > 4) {
            throw new Exception("IPK antara 0.00-4.00 ");
        } else {
            this.IPK = ipk;
            System.out.println("Tanggal lahir valid");
        }
    }

    public float getIPK() {
        System.out.println("IPK Valid");
        return IPK;
    }
}