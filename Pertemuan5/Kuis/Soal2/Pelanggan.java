package Pertemuan5.Kuis.Soal2;

import java.util.List;
import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String noTelepon;

    private List<Kendaraan> daftarKendaraan = new ArrayList<>();

    public Pelanggan(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
    }

    public List<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }

    public String getInfo() {
        return "Pelanggan{nama=" + nama + ", telp=" + noTelepon + "}";
    }
}