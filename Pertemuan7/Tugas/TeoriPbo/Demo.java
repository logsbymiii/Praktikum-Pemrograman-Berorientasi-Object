package Pertemuan7.Tugas.TeoriPbo;
public class Demo {
    public static void main(String[] args) {
        BarangElektronik be = new BarangElektronik("BE01", "Proyektor", "Baik", 300);
        BarangNonElektronik bn = new BarangNonElektronik("BN01", "Meja Kayu", "Baik", "Kayu");

        System.out.println("\n=== Overriding ===");
        System.out.println(be.getInfo());
        System.out.println(bn.getInfo());
        System.out.println("Kategori : " + be.getKategori());
        System.out.println("Kategori : " + bn.getKategori());
        System.out.println("Denda 3 hari (elektronik)     : " + be.hitungDenda(3));
        System.out.println("Denda 3 hari (non-elektronik) : " + bn.hitungDenda(3));

        System.out.println("\n=== Overloading ===");
        System.out.println(be.getInfo("Data Proyektor"));
        be.updateKondisi("Rusak Ringan");        // versi String
        bn.updateKondisi(3);                     // versi int
        be.catat("Dipinjam", 2);                 // (String, int)
        be.catat(2, "unit dikembalikan");        // (int, String)

        System.out.println("\n=== Final ===");
        System.out.println(be.cekKondisi());
        System.out.println(bn.cekKondisi());
    }
}