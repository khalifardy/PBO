package TP07;

public class Semut extends Koordinat{
    private Serangga S;
    public Semut(String warna, int x, int y) {
        super(x, y);
        S = new Serangga(warna);
    }

    public void gerak(int[] koordinat) {
        setX(koordinat[0]);
        setY(koordinat[1]);
    }

    public void info() {
        System.out.println("Posisi Semut : X = " + getX() + "\n              Y = " + getY());
    }

    public void setWarna(String warna){
        S.setWarna(warna);
    }

    public String getWarna(){
        return S.getWarna();
    }
}

