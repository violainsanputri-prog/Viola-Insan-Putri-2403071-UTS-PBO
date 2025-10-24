import java.util.ArrayList;

public class Order {
    private String id;
    private Pelanggan pelanggan;
    private ArrayList<OrderItem> items;
    private int total;
    private StatusLaundry status;
    private String tanggal;

    public Order(String id, Pelanggan pelanggan, String tanggal) {
        this.id = id;
        this.pelanggan = pelanggan;
        this.tanggal = tanggal;
        this.items = new ArrayList<>();
        this.status = new StatusLaundry("Diterima");
    }

    public void tambahItem(Layanan layanan, double qty) {
        OrderItem item = new OrderItem(layanan, qty);
        items.add(item);
        hitungTotal();
    }

    public void hitungTotal() {
        total = 0;
        for (OrderItem i : items) {
            total += i.getSubtotal();
        }
    }

    public void lihatData() {
        System.out.println("Order ID: " + id);
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Status: " + status.getKeterangan());
        for (OrderItem i : items) {
            i.tampilItem();
        }
        System.out.println("Total: Rp" + total);
    }

    public int getTotal() {
        return total;
    }

    public StatusLaundry getStatus() {
        return status;
    }
}
