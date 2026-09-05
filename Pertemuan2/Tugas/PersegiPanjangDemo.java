package Tugas;
public class PersegiPanjangDemo { // class demo untuk persegi panjang
    public static void main(String[] args) { // method main untuk menjalankan program
        PersegiPanjang p1 = new PersegiPanjang(); // membuat objek p1 dari class PersegiPanjang
        p1.panjang = 10; // mengisi nilai panjang dari objek p1
        p1.lebar = 5; // mengisi nilai lebar dari objek p1

        p1.displayInfo(); // memanggil method displayInfo dari objek p1 untuk menampilkan informasi panjang dan lebar
        System.out.println("Luas     : " + p1.getLuas()); // memanggil method getLuas dari objek p1 untuk menghitung luas dan menampilkannya
        System.out.println("Keliling : " + p1.getKeliling());   // memanggil method getKeliling dari objek p1 untuk menghitung keliling dan menampilkannya
    }
}
