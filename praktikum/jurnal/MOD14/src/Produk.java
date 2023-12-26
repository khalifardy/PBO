import java.sql.*;

public class Produk {
    private String nama;
    private int harga;
    private int stok;

    // Constructor
    public Produk(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Getter for harga
    public int getHarga() {
        return harga;
    }

    // Getter for stok
    public int getStok() {
        return stok;
    }
    
    public void insert_produk() throws SQLException{
        Database db = new Database();
        String sql = "insert into tabel_produk (nama, harga, stok) values ('"+this.getNama()+"',"
                + "'"+this.getHarga()+"','"+this.getStok()+"')";
        db.query(sql);              
    }
    
    
}
