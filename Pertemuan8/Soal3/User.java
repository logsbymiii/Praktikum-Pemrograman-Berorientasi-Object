package Pertemuan8.Soal3;
public class User {
    protected UserProfile profile;

    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        this.profile = new UserProfile(user_id, password, name, age, email_id, doc);
    }

    public void log_in(int user_id, int password) {
        System.out.println("User dengan ID " + user_id + " berhasil login");
    }

    public void recover_password() {
        System.out.println("Link pemulihan password dikirim ke " + profile.get_email());
    }

    public void log_out() {
        System.out.println(profile.get_name() + " berhasil logout");
    }
}