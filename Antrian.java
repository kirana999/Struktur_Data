public class Antrian {
    private Pembeli sekarang;  // pointer ke pembeli di depan antrian
    private Pembeli terakhir;  // pointer ke pembeli di belakang antrian

    public Antrian() {
        this.sekarang = null;
        this.terakhir = null;
    }

    // Menambah pembeli ke antrian
    public void tambahPengantri(Pembeli p) {
        if (habiskah()) {
            sekarang = p;
            terakhir = p;
        } else {
            terakhir.next = p;
            terakhir = p;
        }
        System.out.println(p.getNama() + " ditambahkan ke antrian");
    }

    // Melayani pembeli terdepan dan menghapusnya dari antrian
    public Pembeli layani() {
        if (habiskah()) {
            System.out.println("Antrian kosong, tidak ada pembeli yang bisa dilayani");
            return null;
        }
        Pembeli pembeliDilayani = sekarang;
        sekarang = sekarang.next;
        if (sekarang == null) { // jika antrian kosong setelah melayani
            terakhir = null;
        }
        System.out.println(pembeliDilayani.getNama() + " telah dilayani");
        return pembeliDilayani;
    }

    // Mengembalikan pembeli terdepan tanpa menghapus dari antrian
    public Pembeli terdepan() {
        if (habiskah()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return sekarang;
    }

    // Mengecek apakah antrian kosong
    public Boolean habiskah() {
        return sekarang == null;
    }

    // Implementasi
    public static void main(String[] args) {
        Antrian antrian = new Antrian();

        Pembeli p1 = new Pembeli("Prameswari");
        Pembeli p2 = new Pembeli("Kirana");
        Pembeli p3 = new Pembeli("Jingga");

        antrian.tambahPengantri(p1);
        antrian.tambahPengantri(p2);
        antrian.tambahPengantri(p3);

        System.out.println("Pembeli terdepan: " + (antrian.terdepan() != null ? antrian.terdepan().getNama() : "kosong"));

        antrian.layani();
        antrian.layani();

        System.out.println("Pembeli terdepan setelah 2 pelayanan: " + (antrian.terdepan() != null ? antrian.terdepan().getNama() : "kosong"));

        antrian.layani();

        System.out.println("Apakah antrian habis? " + antrian.habiskah());
    }
    
}
