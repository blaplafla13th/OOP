package lab2;

public class Contains {
    public static void main(String[] args) {
        int[] intTestMul = {1, 2, 3, 4, 5};
        int checkInt = 10;
        if (contains(intTestMul, checkInt))
            System.out.printf("This array contains element %d", checkInt);
        else
            System.out.printf("This array don't contains element %d", checkInt);
    }

    public static boolean contains(int[] array, int checkInt) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkInt)
                return true;
        }
        return false;
    }
}
