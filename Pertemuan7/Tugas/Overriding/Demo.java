package Pertemuan7.Tugas.Overriding;

public class Demo {
    public static void main(String[] args) {
        Manusia m;          

        m = new Manusia();
        m.makan();

        m = new Dosen();
        m.makan();          

        m = new Mahasiswa();
        m.makan();          

        m.bernafas();       
    }
}