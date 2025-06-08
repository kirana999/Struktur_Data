public class DemoKelas {
    public static void main(String[] args) {
        Siswa prameswari = new Siswa("Prameswari");

        Kelas k = new Kelas(prameswari);

        Siswa kirana = new Siswa("Kirana");
        k.tambahDiBelakang(kirana);
        k.tambahDiBelakang(new Siswa("Jingga"));
        k.tambahDiBelakang(new Siswa("Aswandy"));
        k.tambahDiBelakang(new Siswa("Rifki"));
        k.tampilkanSemua();

        k.tambahDiDepan(new Siswa("Jeje"));
        System.out.println("=========================");
        k.tampilkanSemua();

        Integer urutan = 7;
        Siswa x = k.ambilDi(urutan);
        if(x != null) {
            System.out.println("Siswa urutan "+ urutan +" : "+x.nama);
        } else {
            System.out.println("Siswa urutan "+urutan+" tidak ada");
        }


        System.out.println("===================");
        System.out.println("Jumlah siswa : "+k.jumlahSiswa());

        Kelas k1 = new Kelas(null);
        System.out.println("Jumlah siswa : "+k1.jumlahSiswa());

        System.out.println("=========================");
        System.out.println("Cari nama Nabila di kelas kosong : " +k1.urutan("Nabila"));
        System.out.println("Cari nama Nabila di kelas berisi : " +k.urutan("Nabila"));
        System.out.println("Cari nama Kirana di kelas berisi : " +k.urutan("Kirana"));
        System.out.println("Cari nama Jeje di kelas berisi : " +k.urutan("Jeje"));
        System.out.println("Cari nama Rifki di kelas berisi : " +k.urutan("Rifki"));

        System.out.println("=========================");
        k.tambahSetelah("Aswandy", new Siswa("Raja"));
        k.tampilkanSemua();
        System.out.println("Jumlah siswa : "+k.jumlahSiswa());

        System.out.println("=========================");
        k1.hapus("Razwa");
        k1 = new Kelas(new Siswa("Razwa"));
        System.out.println("Setelah di-add");
        k1.tampilkanSemua();
        k1.hapus("Razwa");
        System.out.println("Setelah dihapus");
        k1.tampilkanSemua();

        System.out.println("========== Sebelum dihapus ===============");
        k.tampilkanSemua();
        k.hapus("Jeje");
        System.out.println("========== Setelah hapus pertama ===============");
        k.tampilkanSemua();
        k.hapus("Kirana");
        System.out.println("========== Setelah hapus tengah ===============");
        k.tampilkanSemua();
        k.hapus("Rifki");
        System.out.println("========== Setelah hapus akhir ===============");
        k.tampilkanSemua();
    }

}
