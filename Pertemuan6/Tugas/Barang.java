// parent class
package Tugas;
public class Barang { //class barang
    protected String kodeBarang; //atribut dengan modifier protected agar bisa diakses sama child
    protected String namaBarang;
    protected String kondisiBarang;

    public Barang() { //constructor tanpa parameter
        System.out.println("Objek dari class Barang dibuat");
    }

    public Barang(String kodeBarang, String namaBarang, String kondisiBarang) { //menggunakan constructor berparameter
        this.kodeBarang = kodeBarang; //this merujuk ke atribut milik objek ini
        this.namaBarang = namaBarang;
        this.kondisiBarang = kondisiBarang;
        System.out.println("Objek dari class Barang dibuat dengan constructor berparameter");
    }

    public String getInfo() { //method untuk menampilkan info barang, diwariskan ke semua child
        String info = "";
        info += "Kode Barang    : " + kodeBarang + "\n";
        info += "Nama Barang    : " + namaBarang + "\n";
        info += "Kondisi Barang : " + kondisiBarang + "\n";
        return info;
    }
}