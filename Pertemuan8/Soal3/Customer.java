package Pertemuan8.Soal3;
public class Customer extends User {
    private boolean verification_status = false;

    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        System.out.println(profile.get_name() + " mengajukan verifikasi dengan dokumen " + doc);
    }
}