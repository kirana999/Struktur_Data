public class Pembeli {
    private String nama;
    Pembeli next; // pointer ke pembeli berikutnya dalam antrian

    public Pembeli(String nama) {
        this.nama = nama;
        this.next = null;
    }

    public String getNama() {
        return nama;
    }
}
