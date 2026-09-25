package Pertemuan5.Kuis.Soal2;

public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String posisi;

    public Karyawan(String idKaryawan, String namaKaryawan, String posisi) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.posisi = posisi;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public double prosesLayanan(Kendaraan kendaraan, Layanan layanan) {
        double total = kendaraan.hitungTotalBiaya(layanan);
        System.out.println(namaKaryawan + " memproses \"" + layanan.getServiceName()
                + "\" untuk " + kendaraan.getInfo() + " -> Total: Rp" + (long) total);
        return total;
    }

    public String getInfo() {
        return "Karyawan{id=" + idKaryawan + ", nama=" + namaKaryawan + ", posisi=" + posisi + "}";
    }
}