package Tugas;
public class PersegiPanjang { // class persegi panjang
    public int panjang; // atribut panjang
    public int lebar; //atribut lebar 

    public void displayInfo(){ //method displayInfo untuk menampilkan informasi panjang dan lebar dari persegi panjang
        System.out.println("Panjang : " + panjang); // menampilkan panjang
        System.out.println("Lebar   : " + lebar); // menampilkan lebar
    }

    public int getLuas(){ //method getLuas untuk menghitung luas dari persegi panjang
        return panjang * lebar; //mengembalikan nilai luas dari persegi panjang
    }

    public int getKeliling(){ //method getKeliling untuk menghitung keliling dari persegi panjang
        return 2 * (panjang + lebar); //mengembalikan nilai keliling dari persegi panjang dengan rumus keliling persegi panjang
    }
}
