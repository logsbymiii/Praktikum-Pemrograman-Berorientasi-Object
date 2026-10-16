package Pertemuan8.Soal2;
public class BarangNonElektronik extends Barang {
    protected String bahan;

    public BarangNonElektronik(String kodeBarang, String namaBarang, String bahan) {
        super(kodeBarang, namaBarang);
        this.bahan = bahan;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Bahan       : " + bahan);
    }
}