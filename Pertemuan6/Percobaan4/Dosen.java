package Percobaan4;

public class Dosen extends Pegawai {
    public String nidn; //atribut dosen
   
    public Dosen() {
        System.out.println("Object Dari Class Dosen Dibuat");
    }

    public String getAllInfo(){
        String info = "";
        info += "NIP             : " + super.nip + "\n"; //dikasi super
        info += "Nama            : " + super.nama + "\n";
        info += "Gaji            : " + super.gaji + "\n";
        info += "NIDN            : " + this.nidn + "\n"; // diganti this
        
        return info;
    }
}
