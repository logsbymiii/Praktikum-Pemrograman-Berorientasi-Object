package Tugas;
public class Lampu { // class lampu
    public String ukuran; // atribut yang ada pada class lampu
    public String jenis; // ukuran,kecerahan,dan harga  
    public int kecerahan;
    public double harga;

    public void info(){ //method info untuk menampilkan informasi lampu
        System.out.println("Informasi Lampu");
        System.out.println("Jenis lampu: " + jenis);
        System.out.println("Ukuran lampu: " + ukuran);
        System.out.println("Kecerahan lampu: " + kecerahan + "%");
        System.out.println("Harga lampu: Rp" + harga);
    }
 
    public void nyalakan(){ //method nyalakan untuk menyalakan lampu
        System.out.println("Lampu " + jenis + " ukuran " + ukuran + " menyala dengan kecerahan " + kecerahan + "%");
    }
 
    public void matikan(){ //method matikan untuk mematikan lampu
        System.out.println("Lampu " + jenis + " dimatikan");
    }
 
    public void gantiWarna(){ //method gantiWarna untuk mengganti warna lampu
        System.out.println("Warna lampu " + jenis + " telah diganti");
    }
 
    public void nyalaOtomatis(){ //method nyalaOtomatis untuk menyalakan lampu secara otomatis
        System.out.println("Lampu " + jenis + " menyala otomatis (sensor aktif)");
    }
 
    public void matiOtomatis(){ //method matiOtomatis untuk mematikan lampu secara otomatis
        System.out.println("Lampu " + jenis + " mati otomatis (sensor aktif)");
    }
}