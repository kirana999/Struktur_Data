import java.util.Arrays;

public class selectionSort {
    // Fungsi untuk melakukan selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Temukan indeks elemen terkecil di sisa array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen terkecil dengan elemen di posisi i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Fungsi utama untuk menguji selection sort
    public static void main(String[] args) {
        int[] data = {19, 13, 11, 10, 8, 5, 4, 1, 20, 6};
        System.out.println("Sebelum sorting: " + Arrays.toString(data));
        selectionSort(data);
        System.out.println("Setelah sorting: " + Arrays.toString(data));
    }
}
