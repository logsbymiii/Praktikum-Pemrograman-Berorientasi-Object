package Percobaan5;

public class Dosen extends Pegawai {
    public String nidn; //atribut dosen
   
    public Dosen() {
        System.out.println("Object Dari Class Dosen Dibuat");
    }

    public String getInfo(){
        return "NIDN        : " + this.nidn +  "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
