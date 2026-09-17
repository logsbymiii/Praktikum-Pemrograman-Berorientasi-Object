package PeminjamanBarang;

import java.util.ArrayList;

public class Peminjaman {
    private String kodePeminjaman;
    private Anggota peminjam;
    private ArrayList<Barang> daftarBarang;
    private boolean sudahDikembalikan;

    public Peminjaman(String kodePeminjaman, Anggota peminjam) {
        this.kodePeminjaman = kodePeminjaman;
        this.peminjam = peminjam;
        this.daftarBarang = new ArrayList<Barang>();
        this.sudahDikembalikan = false;
    }

    public void pinjamBarang(Barang barang) {
        barang.kurangiStok(1);
        this.daftarBarang.add(barang);
    }

    public void kembalikanSemua() {
        for (Barang barang : daftarBarang) {
            barang.tambahStok(1);
        }
        this.sudahDikembalikan = true;
    }

    public String getInfo() {
        String info = "";
        info += "Kode Peminjaman : " + this.kodePeminjaman + "\n";
        info += "Peminjam        : " + this.peminjam.getInfo() + "\n";
        info += "Status          : " + (this.sudahDikembalikan ? "Sudah dikembalikan" : "Sedang dipinjam") + "\n";

        if (!daftarBarang.isEmpty()) {
            info += "Daftar Barang   :\n";
            for (Barang barang : daftarBarang) {
                info += "  - " + barang.getInfo() + "\n";
            }
        }
        else {
            info += "Belum ada barang yang dipinjam";
        }

        info += "\n";
        return info;
    }
}