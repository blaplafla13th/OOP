public class Search {
    public static void main(String[] args) {
        int[] intTestMul = {1, 2, 3, 4, 5};
        int checkInt = 3;

            System.out.printf("Index of element %d in this array is: %d",checkInt,search(intTestMul, checkInt));

    }

    public static int search(int[] array, int checkInt) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkInt)
                return i;
        }
        return -1;
    }
}
