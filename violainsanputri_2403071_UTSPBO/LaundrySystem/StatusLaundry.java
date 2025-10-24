public class StatusLaundry {
    private String keterangan;

    public StatusLaundry(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setDiterima() { keterangan = "Diterima"; }
    public void setDicuci() { keterangan = "Dicuci"; }
    public void setDisetrika() { keterangan = "Disetrika"; }
    public void setSelesai() { keterangan = "Selesai"; }
    public void setDiambil() { keterangan = "Diambil"; }

    public String getKeterangan() {
        return keterangan;
    }
}
