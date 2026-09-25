package Pertemuan5.Kuis.Soal2;

public class Mobil extends Kendaraan {
    public Mobil(String platNomor, String merek, String model) {
        super(platNomor, merek, model, "Mobil");
    }

    public double hitungBiayaTambahan() {
        return 50000;
    }
}