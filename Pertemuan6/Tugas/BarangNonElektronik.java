// child class 2
package Tugas;
public class BarangNonElektronik extends Barang { //extends artinya BarangNonElektronik mewarisi Barang
    protected String bahan; //atribut tambahan khusus BarangNonElektronik

    public BarangNonElektronik() { //constructor tanpa parameter
        super();
        System.out.println("Objek dari class BarangNonElektronik dibuat");
    }

    public BarangNonElektronik(String kodeBarang, String namaBarang, String kondisiBarang, String bahan) { //constructor berparameter
        super(kodeBarang, namaBarang, kondisiBarang); //manggil constructor berparameter milik parent (Barang)
        this.bahan = bahan; //baru isi atribut milik BarangNonElektronik sendiri
        System.out.println("Objek dari class BarangNonElektronik dibuat dengan constructor berparameter");
    }
}