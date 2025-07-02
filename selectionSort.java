import java.util.Arrays;
import java.util.Random;

public class Selectionsort {

    /**
     * Mengurutkan array integer menggunakan algoritma selection sort.
     * <p>
     * <b>Kompleksitas Waktu (Time Complexity):</b> O(n²)
     * Algoritma ini memiliki dua loop bersarang. Loop luar berjalan n-1 kali dan
     * loop dalam berjalan sekitar n kali pada setiap iterasi luar. Ini membuatnya
     * tidak efisien untuk dataset besar. Kompleksitasnya tetap O(n²) untuk
     * kasus terbaik, rata-rata, dan terburuk.
     * <p>
     * <b>Kompleksitas Ruang (Space Complexity):</b> O(1)
     * Algoritma ini adalah "in-place", yang berarti hanya memerlukan sejumlah kecil
     * ruang memori tambahan (konstan) untuk variabel sementara, terlepas dari
     * ukuran input array.
     *
     * @param arr Array integer yang akan diurutkan.
     */
    public void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Tidak melakukan apa-apa jika array kosong atau null
        }

        int n = arr.length;

        // Iterasi untuk setiap elemen array kecuali yang terakhir
        // i adalah batas antara bagian yang sudah terurut dan yang belum
        for (int i = 0; i < n - 1; i++) {
            // Asumsikan elemen pertama dari bagian yang belum terurut adalah yang terkecil
            int minIndex = i;

            // Cari elemen terkecil di sisa array yang belum terurut
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    // Jika ditemukan elemen yang lebih kecil, simpan indeksnya
                    minIndex = j;
                }
            }

            // Tukar elemen terkecil yang ditemukan dengan elemen pertama dari
            // bagian yang belum terurut (elemen di posisi i)
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Selectionsort sorter = new Selectionsort();

        // --- Uji Coba dengan Data Kecil ---
        System.out.println("--- UJI COBA DATA KECIL ---");
        int[] data = {64, 25, 12, 22, 11, 13, 28, 75, 55, 27};
        System.out.println("Array sebelum diurutkan: " + Arrays.toString(data));

        // Catat waktu mulai
        long startTimeSmall = System.nanoTime();

        sorter.selectionSort(data);

        // Catat waktu selesai
        long endTimeSmall = System.nanoTime();
        long durationSmall = endTimeSmall - startTimeSmall;

        System.out.println("\nArray setelah diurutkan: " + Arrays.toString(data));
        System.out.println("Waktu eksekusi untuk data kecil: " + durationSmall + " nanodetik (" + (durationSmall / 1_000_000.0) + " milidetik)");

        // --- Uji Coba dengan Data Besar ---
        System.out.println("\n--- UJI COBA DATA BESAR ---");
        int largeDataSize = 1000;
        int[] largeData = new int[largeDataSize];
        Random rand = new Random();
        for (int i = 0; i < largeDataSize; i++) {
            largeData[i] = rand.nextInt(100000); // Angka acak antara 0 dan 99999
        }

        System.out.println("Mengurutkan array dengan " + largeDataSize + " elemen acak...");
        long startTimeLarge = System.nanoTime();
        sorter.selectionSort(largeData);
        long endTimeLarge = System.nanoTime();
        long durationLarge = endTimeLarge - startTimeLarge;

        System.out.println("Array besar selesai diurutkan.");
        System.out.println("Waktu eksekusi untuk data besar: " + durationLarge + " nanodetik (" + (durationLarge / 1_000_000.0) + " milidetik)");
    }
}
