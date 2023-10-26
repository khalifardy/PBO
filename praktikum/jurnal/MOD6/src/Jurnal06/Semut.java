package Jurnal06;

import java.util.ArrayList;

public class Semut extends Serangga {
    private Koordinat lokasisarang;
    private ArrayList<Koordinat> rute;
    private int idxRute;

    // Konstruktor
    public Semut(String warna, int x, int y) {
        super(warna);
        super.gerak(x, y);
        this.lokasisarang = new Koordinat(x, y);
        this.rute = new ArrayList<>();
        this.idxRute = 0;
    }

    public int getIdxRute() {
        return idxRute;
    }

    public void setLokasisarang(int x, int y) {
        lokasisarang.setX(x);
        lokasisarang.setY(y);
    }

    public Koordinat getLokasisarang() {
        return lokasisarang;
    }

    public ArrayList<Koordinat> getRute() {
        return rute;
    }

    public void tambahRute(Koordinat koordinat) {
        if (idxRute <= 3) {
            rute.add(koordinat);
            idxRute++;
        } else {
            System.out.println("Rute sudah maksimal");
        }
    }

    @Override
    public void gerak(int x, int y) {
        super.gerak(x, y);
        tambahRute(new Koordinat(x, y));
    }

    public void kembaliKesarang() {
        idxRute--;
        if (idxRute != 0) {
            int x = (int) rute.get(idxRute - 1).getX();
            int y = (int) rute.get(idxRute - 1).getY();
            super.gerak(x, y);
        } else {
            super.gerak((int)lokasisarang.getX(), (int)lokasisarang.getY());
        }
    }
}

