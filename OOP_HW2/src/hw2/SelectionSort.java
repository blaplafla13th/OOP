package hw2;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 8, 6, 3, 9, 2, 4, 7, 5, 0};
        selectionSort(array);
        print(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    static void print(int[] array) {
        if (array.length == 1) System.out.print("[" + array[0] + "]");
        else
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else if (i == array.length - 1) {
                    System.out.print(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
    }
}
