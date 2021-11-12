public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 8, 6, 3, 9, 2, 4, 7, 5, 0};
        insertionSort(array);
        print(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
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
