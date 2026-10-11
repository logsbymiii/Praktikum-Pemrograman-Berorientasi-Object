package Pertemuan7.Tugas.TeoriPbo;
public final class BarangNonElektronik extends Barang {   
    protected String bahan;

    public BarangNonElektronik() {
        System.out.println("Objek dari class BarangNonElektronik dibuat");
    }

    public BarangNonElektronik(String kodeBarang, String namaBarang, String kondisiBarang, String bahan) {
        super(kodeBarang, namaBarang, kondisiBarang);
        this.bahan = bahan;
        System.out.println("Objek dari class BarangNonElektronik dibuat dengan constructor berparameter");
    }

    @Override
    public String getInfo() {                             // OVERRIDING
        return super.getInfo() + "Bahan          : " + bahan + "\n";
    }

    @Override
    public String getKategori() {                         // OVERRIDING
        return "Barang Non-Elektronik";
    }

    @Override
    public double hitungDenda(int hariTerlambat) {        // OVERRIDING
        return hariTerlambat * 2000;
    }
}