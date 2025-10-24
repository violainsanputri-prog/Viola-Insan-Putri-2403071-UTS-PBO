public class User {
    protected String username;
    protected String password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password salah!");
        }
    }

    public void tambahData() {
        System.out.println("Menambah data user...");
    }

    public void lihatData() {
        System.out.println("Menampilkan data user...");
    }
}
