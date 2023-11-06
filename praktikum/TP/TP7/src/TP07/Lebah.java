package TP07;

public class Lebah extends Koordinat3D implements BisaTerbang {
    private Serangga S;

    public Lebah(int x, int y, int z, String warna) {
        super(x, y, z);
        S = new Serangga(warna);
    }

    public void gerak(int[] koordinat) {
        setX(koordinat[0]);
        setY(koordinat[1]);
        setZ(koordinat[2]);
    }

    public void terbang(int x, int y, int z) {
        setX(getX() + x);
        setY(getY() + y);
        setZ(getZ() + z);
    }

    public void info() {
        System.out.println("Posisi Lebah : X = " + getX() + "\n              Y = " + getY() + "\n             Z = " + getZ());
    }

    public void setWarna(String warna){
        S.setWarna(warna);
    }

    public String getWarna(){
        return S.getWarna();
    }
}
