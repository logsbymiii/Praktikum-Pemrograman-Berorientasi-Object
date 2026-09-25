package Pertemuan5.Kuis.Soal2;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public double hitungBiayaTambahan() {
        return 0;
    }

    public double hitungTotalBiaya(Layanan layanan) {
        return layanan.getServicePrice() + hitungBiayaTambahan();
    }

    public String getInfo() {
        return tipeKendaraan + "{plat=" + platNomor + ", merek=" + merek + ", model=" + model + "}";
    }
}