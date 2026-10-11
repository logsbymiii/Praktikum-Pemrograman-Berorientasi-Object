package Pertemuan7.Tugas.TeoriPbo;
public class BarangElektronik extends Barang {
    protected int dayaListrik;

    public BarangElektronik() {
        System.out.println("Objek dari class BarangElektronik dibuat");
    }

    public BarangElektronik(String kodeBarang, String namaBarang, String kondisiBarang, int dayaListrik) {
        super(kodeBarang, namaBarang, kondisiBarang);
        this.dayaListrik = dayaListrik;
        System.out.println("Objek dari class BarangElektronik dibuat dengan constructor berparameter");
    }

    @Override
    public String getInfo() {                             // OVERRIDING
        return super.getInfo() + "Daya Listrik   : " + dayaListrik + " Watt\n";
    }

    @Override
    public String getKategori() {                         // OVERRIDING
        return "Barang Elektronik";
    }

    @Override
    public double hitungDenda(int hariTerlambat) {        // OVERRIDING
        return hariTerlambat * 5000;
    }
}