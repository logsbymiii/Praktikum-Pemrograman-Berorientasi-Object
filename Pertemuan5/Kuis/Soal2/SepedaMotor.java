package Pertemuan5.Kuis.Soal2;

public class SepedaMotor extends Kendaraan {
    public SepedaMotor(String platNomor, String merek, String model) {
        super(platNomor, merek, model, "Sepeda Motor");
    }

    public double hitungBiayaTambahan() {
        return 20000;
    }
}