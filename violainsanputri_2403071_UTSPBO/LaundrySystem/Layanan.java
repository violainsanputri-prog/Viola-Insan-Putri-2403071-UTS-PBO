public class Layanan {
    private String id;
    private String nama;
    private String jenis;
    private int harga;

    public Layanan(String id, String nama, String jenis, int harga) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public void tambahData() {
        System.out.println("Menambah data layanan...");
    }

    public void lihatData() {
        System.out.println(nama + " (" + jenis + ") - Rp" + harga);
    }

    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }
}
