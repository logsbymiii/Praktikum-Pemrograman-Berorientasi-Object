package Pertemuan8.Soal2;


public class Barang {
    protected String kodeBarang;
    protected String namaBarang;

    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public void getInfo() {
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
    }
}