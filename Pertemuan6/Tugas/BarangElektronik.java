// child class
package Tugas;
public class BarangElektronik extends Barang {      
    protected int dayaListrik; //atribut tambahan baru

    public BarangElektronik() { //constructor tanpa parameter
        super();
        System.out.println("Objek dari class BarangElektronik dibuat");
    }

    public BarangElektronik(String kodeBarang, String namaBarang, String kondisiBarang, int dayaListrik) { //constructor berparameter
        super(kodeBarang, namaBarang, kondisiBarang); //manggil constructor berparameter milik parent (Barang)
        this.dayaListrik = dayaListrik; //baru isi atribut milik BarangElektronik sendiri
        System.out.println("Objek dari class BarangElektronik dibuat dengan constructor berparameter");
    }
}