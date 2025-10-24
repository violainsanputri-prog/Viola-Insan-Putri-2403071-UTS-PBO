public class OrderItem {
    private Layanan layanan;
    private double qty;
    private int subtotal;

    public OrderItem(Layanan layanan, double qty) {
        this.layanan = layanan;
        this.qty = qty;
        hitungSubtotal();
    }

    public void hitungSubtotal() {
        subtotal = (int) (layanan.getHarga() * qty);
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void tampilItem() {
        System.out.println(layanan.getNama() + " x" + qty + " = Rp" + subtotal);
    }
}
