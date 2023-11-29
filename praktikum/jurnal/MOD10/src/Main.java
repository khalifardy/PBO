import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> mhs = new ArrayList<>();

        // Menambahkan mahasiswa ke dalam array list
        mhs.add(new Mahasiswa("1301228888", "Megumi Fushiguro", new Prodi("IF", "Teknik Informatika"), 3.5));
        System.out.println("Last NIM: " + Mahasiswa.getLastNim());

        mhs.add(new Mahasiswa("1302229999", "Yuji Itadori", new Prodi("RPL", "Rekayasa Perangkat Lunak"), 3.1));
        System.out.println("Last NIM: " + Mahasiswa.getLastNim());

        mhs.add(new Mahasiswa("1303227777", "Ryomen Sukuna", new Prodi("IT", "Teknologi Informasi"), 3.99));
        System.out.println("Last NIM: " + Mahasiswa.getLastNim());

        System.out.println("\nSort by IPK Descending");
        Collections.sort(mhs);

        for (Mahasiswa m : mhs) {
            m.display();
        }

        System.out.println("\nSort by Prodi Ascending");
        Collections.sort(mhs, new ProdiComparator());

        for (Mahasiswa n : mhs) {
            n.display();
        }

        System.out.println("\nTampilkan IPK > 3.5");
        for (Mahasiswa i : mhs) {
            if (i.getIPK() > 3.5) {
                i.display();
            }
        }
    }
}
