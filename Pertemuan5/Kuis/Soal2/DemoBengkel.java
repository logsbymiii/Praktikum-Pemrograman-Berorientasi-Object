package Pertemuan5.Kuis.Soal2;

public class DemoBengkel {
    public static void main(String[] args) {
        System.out.println("=== SISTEM BENGKEL MAJU ===\n");

        Karyawan mekanik = new Karyawan("K01", "Dimas", "Mekanik Senior");

        Pelanggan pel1 = new Pelanggan("Helmi", "081234567890");
        Pelanggan pel2 = new Pelanggan("Fajari", "082345678901");

        // 2 mobil
        Mobil mobil1 = new Mobil("N 1234 AB", "Toyota", "Avanza");
        Mobil mobil2 = new Mobil("N 5678 CD", "Honda", "Brio");

        // 2 sepeda motor
        SepedaMotor motor1 = new SepedaMotor("N 1122 EF", "Yamaha", "NMAX");
        SepedaMotor motor2 = new SepedaMotor("N 3344 GH", "Honda", "Beat");

        pel1.tambahKendaraan(mobil1);
        pel1.tambahKendaraan(motor1);
        pel2.tambahKendaraan(mobil2);
        pel2.tambahKendaraan(motor2);

        Layanan gantiOli = new Layanan("Ganti Oli", 100000);
        Layanan servisRutin = new Layanan("Servis Rutin", 150000);
        Layanan gantiBan = new Layanan("Ganti Ban", 300000);

        System.out.println("--- Data Pelanggan & Kendaraan ---");
        System.out.println(pel1.getInfo());
        for (Kendaraan k : pel1.getDaftarKendaraan()) {
            System.out.println("   -> " + k.getInfo());
        }
        System.out.println(pel2.getInfo());
        for (Kendaraan k : pel2.getDaftarKendaraan()) {
            System.out.println("   -> " + k.getInfo());
        }

        System.out.println("\n--- Proses Layanan ---");
        double totalPendapatan = 0;
        totalPendapatan += mekanik.prosesLayanan(mobil1, gantiOli);
        totalPendapatan += mekanik.prosesLayanan(mobil2, servisRutin);
        totalPendapatan += mekanik.prosesLayanan(motor1, gantiBan);
        totalPendapatan += mekanik.prosesLayanan(motor2, gantiOli);

        System.out.println("\n--- Total Perkiraan Biaya Keseluruhan: Rp" + (long) totalPendapatan + " ---");
    }
}