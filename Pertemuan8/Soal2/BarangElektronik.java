package Pertemuan8.Soal2;
public class BarangElektronik extends Barang {
    protected int dayaListrik;

    public BarangElektronik(String kodeBarang, String namaBarang, int dayaListrik) {
        super(kodeBarang, namaBarang);
        this.dayaListrik = dayaListrik;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Daya Listrik: " + dayaListrik + " Watt");
    }
}