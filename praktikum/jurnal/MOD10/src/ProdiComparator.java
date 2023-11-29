import java.util.Comparator;

public class ProdiComparator implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa mahasiswa1, Mahasiswa mahasiswa2) {
        return mahasiswa1.getProdi().compareTo(mahasiswa2.getProdi());
    }
}
