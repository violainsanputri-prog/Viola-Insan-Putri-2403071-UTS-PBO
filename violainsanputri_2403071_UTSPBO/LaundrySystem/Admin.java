public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void kelolaOrder() {
        System.out.println("Mengelola data order...");
    }

    public void kelolaPembayaran() {
        System.out.println("Mengelola data pembayaran...");
    }
}
