// main class 
package Tugas;
public class Demo {
    public static void main(String[] args) {
        BarangElektronik be = new BarangElektronik(); //instansiasi pakai constructor tanpa parameter
        be.kodeBarang = "BE01"; //isi atribut warisan dari Barang secara manual
        be.namaBarang = "Proyektor";
        be.kondisiBarang = "Baik";
        be.dayaListrik = 300; //isi atribut milik BarangElektronik sendiri

        BarangNonElektronik bn = new BarangNonElektronik("BN01", "Meja Kayu", "Baik", "Kayu"); //instansiasi pakai constructor berparameter

        System.out.println("\n=== Data awal ===");
        System.out.println(be.getInfo() + "Daya Listrik   : " + be.dayaListrik + "\n"); //getInfo() dipanggil tanpa ditulis ulang karena warisan dari Barang
        System.out.println(bn.getInfo() + "Bahan          : " + bn.bahan + "\n");

        be.kondisiBarang = "Rusak Ringan"; //modifikasi atribut warisan
        be.dayaListrik = 250; //modifikasi atribut milik sendiri
        bn.bahan = "Kayu Jati"; //modifikasi atribut milik sendiri

        System.out.println("=== Setelah dimodifikasi ===");
        System.out.println(be.getInfo() + "Daya Listrik   : " + be.dayaListrik + "\n");
        System.out.println(bn.getInfo() + "Bahan          : " + bn.bahan);
    }
}