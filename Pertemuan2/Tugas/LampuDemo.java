package Tugas;
public class LampuDemo { //class lampuDemo

    public static void main(String[] args) { //method main
        Lampu lampu1 = new Lampu(); //membuat objek lampu1 dari class lampu
        lampu1.ukuran = "Kecil";
        lampu1.jenis = "LED";
        lampu1.kecerahan = 80;
        lampu1.harga = 25000;
 
        lampu1.info();
        lampu1.nyalakan();
        lampu1.gantiWarna();
        lampu1.matikan();
 
        System.out.println();
 
        Lampu lampu2 = new Lampu();
        lampu2.ukuran = "Besar";
        lampu2.jenis = "Neon";
        lampu2.kecerahan = 100;
        lampu2.harga = 45000;
 
        lampu2.info();
        lampu2.nyalaOtomatis();
        lampu2.matiOtomatis();
    }
}