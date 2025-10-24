import java.util.ArrayList;

public class LaundrySystem {
    private ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    private ArrayList<Layanan> daftarLayanan = new ArrayList<>();
    private ArrayList<Order> daftarOrder = new ArrayList<>();

    public void inisialisasiData() {
        daftarLayanan.add(new Layanan("L01", "Cuci Kering", "Cuci", 7000));
        daftarLayanan.add(new Layanan("L02", "Setrika", "Setrika", 5000));
        System.out.println("Data layanan berhasil diinisialisasi!");
    }

    public void kelolaPelanggan(Pelanggan p) {
        daftarPelanggan.add(p);
    }

    public void kelolaOrder(Order o) {
        daftarOrder.add(o);
    }

    public void kelolaPembayaran(Pembayaran p) {
        System.out.println("Pembayaran telah ditambahkan ke sistem.");
    }

    public ArrayList<Layanan> getDaftarLayanan() {
        return daftarLayanan;
    }
}
