public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ"); //menambahkan setter untuk platNomor
        motor1.setKecepatan(50);//menambahkan setter untuk kecepatan
        motor1.displayStatus(); //menampilkan status motor1 setelah diubah platNomor dan kecepatan

        Motor motor2 = new Motor(); //membuat objek motor2
        motor2.setPlatNomor("N 9840 AB"); //menambahkan setter untuk platNomor
        motor2.setMesinOn(true); //menambahkan setter untuk isMesinOn agar mesin motor2 menyala
        motor2.setKecepatan(40); //menambahkan setter untuk kecepatan agar motor2 dapat berjalan karena mesinnya menyala
        motor2.displayStatus();
        
        Motor motor3 = new Motor(); //membuat objek motor3
        motor3.setPlatNomor("D 8343 CV"); //menambahkan setter untuk platNomor
        motor3.setKecepatan(60); //menambahkan setter untuk kecepatan agar motor3 dapat berjalan karena mesinnya menyala
        motor3.displayStatus(); //
    }
}