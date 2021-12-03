package hw2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 8, 6, 3, 9, 2, 4, 7, 5, 0};
        bubbleSort(array);
        print(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
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
