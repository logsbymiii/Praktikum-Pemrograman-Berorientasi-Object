package PeminjamanBarang;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int stok;

    public Barang(String kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Dipanggil pas barang dipinjam
    public void kurangiStok(int jumlah) {
        this.stok -= jumlah;
    }

    // Dipanggil pas barang dikembalikan
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public String getInfo() {
        return namaBarang + " (stok: " + this.stok + ")";
    }
}
