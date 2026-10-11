package Pertemuan7.Tugas.TeoriPbo;


public class Barang {
    protected final String kodeBarang;      
    protected String namaBarang;
    protected String kondisiBarang;

    public Barang() {
        this.kodeBarang = "-";
        System.out.println("Objek dari class Barang dibuat");
    }

    public Barang(String kodeBarang, String namaBarang, String kondisiBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kondisiBarang = kondisiBarang;
        System.out.println("Objek dari class Barang dibuat dengan constructor berparameter");
    }

    public String getInfo() {
        String info = "";
        info += "Kode Barang    : " + kodeBarang + "\n";
        info += "Nama Barang    : " + namaBarang + "\n";
        info += "Kondisi Barang : " + kondisiBarang + "\n";
        return info;
    }

    public String getInfo(String judul) {
        return "=== " + judul + " ===\n" + getInfo();
    }

    public String getKategori() {
        return "Barang Umum";
    }

    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 1000;
    }

    public void updateKondisi(String kondisi) {
        this.kondisiBarang = kondisi;
    }

    public void updateKondisi(int kodeKondisi) {
        if (kodeKondisi == 1) {
            this.kondisiBarang = "Baik";
        } else if (kodeKondisi == 2) {
            this.kondisiBarang = "Rusak Ringan";
        } else {
            this.kondisiBarang = "Rusak Berat";
        }
    }

    public void catat(String keterangan, int jumlah) {
        System.out.println("catat(String, int): " + keterangan + " sebanyak " + jumlah);
    }

    public void catat(int jumlah, String keterangan) {
        System.out.println("catat(int, String): " + jumlah + " unit " + keterangan);
    }

    public final String cekKondisi() {
        return "Kondisi " + namaBarang + " : " + kondisiBarang;
    }
}