package Pertemuan7.Tugas.Overloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(sisiA * sisiA + sisiB * sisiB);
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Sudut ketiga (1 sudut diketahui)  : " + s.totalSudut(60));
        System.out.println("Sudut ketiga (2 sudut diketahui)  : " + s.totalSudut(60, 70));
        System.out.println("Keliling (3 sisi)                 : " + s.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi, siku-siku)      : " + s.keliling(3, 4));
    }
}