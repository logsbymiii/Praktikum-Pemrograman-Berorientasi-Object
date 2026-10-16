package Pertemuan8.Soal2;
public class Laptop extends BarangElektronik {
    protected int ram;

    public Laptop(String kodeBarang, String namaBarang, int dayaListrik, int ram) {
        super(kodeBarang, namaBarang, dayaListrik);
        this.ram = ram;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("RAM         : " + ram + " GB");
    }
}