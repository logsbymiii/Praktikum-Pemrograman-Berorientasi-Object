package PeminjamanBarang;

public class PeminjamanDemo {
    public static void main(String[] args) {
        Kategori elektronik = new Kategori("Elektronik");

        Barang proyektor = new Barang("BRG001", "Proyektor", 3);
        Barang laptop = new Barang("BRG002", "Laptop", 5);

        elektronik.tambahBarang(proyektor);
        elektronik.tambahBarang(laptop);

        System.out.println(elektronik.getInfo());

        Anggota Helmi = new Anggota("A001", "Helmi");
        Peminjaman peminjaman1 = new Peminjaman("PJM001", Helmi);
        peminjaman1.pinjamBarang(proyektor);
        peminjaman1.pinjamBarang(laptop);

        System.out.println(peminjaman1.getInfo());

        peminjaman1.kembalikanSemua();
        System.out.println(peminjaman1.getInfo());
    }
}