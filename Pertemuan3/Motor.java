
public class Motor {
    private String platNomor; // merubah modifier menjadi private
    private boolean isMesinOn; // merubah modifier menjadi private
    private int kecepatan; // merubah modifier menjadi private

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan:" + this.kecepatan);
        System.out.println("=========================");
    }

    public String getPlatNomor() { // menambahkan method getter untuk platNomor
        return platNomor;
    }

    public void setPlatNomor(String platNomor) { // menambahkan method setter untuk platNomor
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() { // menambahkan method getter untuk isMesinOn
        return isMesinOn;
    }

    public void setMesinOn(boolean isMesinOn) { /// menambahkan method setter untuk isMesinOn
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() { // menambahkan method getter untuk kecepatan
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan < 0) { // menambah validasi untuk kecepatan agar tidak kurang dari 0
            System.out.print("Kecepatan tidak boleh kurang dari 0");
            this.kecepatan = 0;
        } else if (kecepatan > 100) {
            System.out.print("Kecepatan tidak boleh lebih dari 100");
            this.kecepatan = 100;
        } else {
            this.kecepatan = kecepatan;
        }
    }

}