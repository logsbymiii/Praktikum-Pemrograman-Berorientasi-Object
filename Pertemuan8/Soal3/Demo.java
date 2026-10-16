package Pertemuan8.Soal3;
public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "pass123", "Helmi", 20, "Helmi@mail.com", "ktp.jpg");
        Admin admin = new Admin(2, "admin123", "budiono siregar", 30, "budiono123@mail.com", "id.pdf");

        System.out.println("=== Customer ===");
        customer.log_in(1, 123);
        System.out.println("Status verifikasi: " + customer.get_verification_status());
        customer.apply_verification("ktp.jpg");
        customer.profile.show_documents();
        customer.log_out();

        System.out.println("\n=== Admin ===");
        admin.log_in(2, 456);
        admin.verify_user();
        Vehicle v = admin.add_vehicle();
        admin.update_vehicle_details(v.getVehicle_id());
        admin.Retrieve_complain();
        admin.log_out();
    }
}