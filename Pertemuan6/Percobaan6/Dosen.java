package Percobaan6;

public class Dosen extends Pegawai {
    public String nidn; //atribut dosen
   
    public Dosen( String nip, String nama, double gaji, String nidn) {
        System.out.println("Object Dari Class Dosen Dibuat dengan constructor berparameter");
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
