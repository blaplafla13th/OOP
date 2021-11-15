package hw2;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {1, 8, 6, 3, 9, 2, 4, 7, 5, 0};
        int key = 7;
        if (linearSearch(array, key))
            System.out.printf("Index = %d", linearSearchIndex(array, key));
        else System.out.print("NotFound");

    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key==array[i]) return i;
        }
        return -1;
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key==array[i]) return true;
        }
        return false;
    }
}
