package Pertemuan8.Soal2;


public class Demo {
    public static void main(String[] args) {
        
        BarangElektronik kipas = new BarangElektronik("E001", "Kipas Angin", 45);
        BarangNonElektronik meja = new BarangNonElektronik("N001", "Meja Belajar", "Kayu");
        Laptop laptop = new Laptop("E002", "Laptop Asus", 65, 16);

        System.out.println("=== Barang Elektronik ===");
        kipas.getInfo();

        System.out.println("\n=== Barang Non Elektronik ===");
        meja.getInfo();

        System.out.println("\n=== Laptop ===");
        laptop.getInfo();
    }
}