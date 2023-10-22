package dos;
import matkul.MataKuliah;

import java.util.ArrayList;

public class Admin {
    private ArrayList<MataKuliah> listKurikulum;

    public Admin() {
        this.listKurikulum = new ArrayList<>();
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        listKurikulum.add(matakuliah);
    }

    public ArrayList<MataKuliah> getListMatakuliah() {
        return listKurikulum;
    }
}

