package Percobaan7;


public class Pegawai {
    public String nip;
    public String nama;
    protected  double gaji; //access modifier  gaji dibuah 

    // public Pegawai() { //method khusus atau constructor
    //     System.out.println("Object Dari class Pegawai Dibuat");
    // }

    public Pegawai(String nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji= gaji;
    }

    public String getInfo(){ //merthod get info
        String info = "";
        info += "NIP             : " + nip + "\n";
        info += "Nama            : " + nama + "\n";
        info += "Gaji            : " + gaji + "\n";

        return info;
    }
}
