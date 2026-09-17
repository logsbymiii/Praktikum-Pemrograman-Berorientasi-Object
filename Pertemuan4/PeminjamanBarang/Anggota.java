package PeminjamanBarang;

public class Anggota {
    private String nomorAnggota;
    private String nama;

    public Anggota(String nomorAnggota, String nama) {
        this.nomorAnggota = nomorAnggota;
        this.nama = nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(String nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + this.nomorAnggota + ")";
    }
}
