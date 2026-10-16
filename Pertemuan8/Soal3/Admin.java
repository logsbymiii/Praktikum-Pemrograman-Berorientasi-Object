package Pertemuan8.Soal3;
public class Admin extends User {

    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Data kendaraan ID " + vehicle_id + " diperbarui");
    }

    public Vehicle add_vehicle() {
        System.out.println("Kendaraan baru ditambahkan");
        return new Vehicle(101);
    }

    public void Retrieve_complain() {
        System.out.println("Keluhan pengguna diambil");
    }

    public void verify_user() {
        System.out.println("User berhasil diverifikasi oleh admin " + profile.get_name());
    }
}