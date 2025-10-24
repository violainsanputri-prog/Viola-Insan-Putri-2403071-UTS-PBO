public class Main {
    public static void main(String[] args) {
        LaundrySystem system = new LaundrySystem();
        system.inisialisasiData();

        Pelanggan p1 = new Pelanggan("P001", "Budi", "08123456", "Jl. Merdeka");
        system.kelolaPelanggan(p1);

        Order o1 = new Order("O001", p1, "2025-10-24");
        o1.tambahItem(system.getDaftarLayanan().get(0), 3);  // 3x cuci kering
        o1.tambahItem(system.getDaftarLayanan().get(1), 2);  // 2x setrika
        system.kelolaOrder(o1);

        o1.lihatData();

        Pembayaran pay1 = new Pembayaran("PM001", o1, 40000);
        pay1.prosesPembayaran();
        system.kelolaPembayaran(pay1);
    }
}
