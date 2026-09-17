package PeminjamanBarang;

import java.util.ArrayList;

public class Kategori {
    private String namaKategori;
    private ArrayList<Barang> daftarBarang;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarBarang = new ArrayList<Barang>();
    }

    public void tambahBarang(Barang barang) {
        this.daftarBarang.add(barang);
    }

    public String getInfo() {
        String info = "";
        info += "Kategori: " + this.namaKategori + "\n";

        for (Barang barang : daftarBarang) {
            info += "  - " + barang.getInfo() + "\n";
        }

        return info;
    }
}