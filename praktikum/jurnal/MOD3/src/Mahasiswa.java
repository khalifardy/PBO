class Mahasiswa {
    private String nim = "";
    private String nama = "";
    private Prodi prodi = new Prodi();
    private double IPK = 0.0;

    private static final String[] jurusan = {
            "1301", "IF",
            "1302", "SE",
            "1303", "IT",
            "1305", "DS"
    };

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public void setProdi(Prodi prodi) {
        if (prodi.getKode().equals(jurusan[getIndex(nim)])) {
            this.prodi = prodi;
        } else {
            System.out.println("Prodi tidak sesuai dengan nim");
        }
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public int getAngkatan() {
        int digit = Integer.parseInt(nim.substring(4, 6));
        if (digit >= 0 && digit <= 23) {
            return Integer.parseInt("20" + digit);
        } else if (digit >= 90 && digit <= 99) {
            return Integer.parseInt("19" + digit);
        } else if (digit >= 24 && digit <= 89) {
            return 0;
        }
        return 0;
    }

    private int getIndex(String nim) {
        for (int i = 0; i < jurusan.length; i += 2) {
            if (nim.substring(0, 4).equals(jurusan[i])) {
                return i + 1;
            }
        }
        return -1;
    }
}