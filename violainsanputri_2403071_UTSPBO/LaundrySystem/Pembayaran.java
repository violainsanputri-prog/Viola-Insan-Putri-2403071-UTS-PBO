public class Pembayaran {
    private String id;
    private Order order;
    private int bayar;
    private int kembali;

    public Pembayaran(String id, Order order, int bayar) {
        this.id = id;
        this.order = order;
        this.bayar = bayar;
        this.kembali = bayar - order.getTotal();
    }

    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran...");
        System.out.println("Total: Rp" + order.getTotal());
        System.out.println("Bayar: Rp" + bayar);
        System.out.println("Kembali: Rp" + kembali);
    }

    public void lihatRiwayat() {
        System.out.println("Pembayaran ID: " + id + " | Total: Rp" + order.getTotal());
    }
}
