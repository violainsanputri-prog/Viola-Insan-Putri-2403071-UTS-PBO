public class Pelanggan {
    private String id;
    private String nama;
    private String telepon;
    private String alamat;

    public Pelanggan(String id, String nama, String telepon, String alamat) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    public void tambahData() {
        System.out.println("Menambah data pelanggan...");
    }

    public void lihatData() {
        System.out.println("Pelanggan: " + nama + " (" + id + ")");
    }

    public String getNama() {
        return nama;
    }
}
