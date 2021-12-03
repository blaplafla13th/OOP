package lab2;

public class CopyOf {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] cloneOfArray1 = copyOf(array);
        print(cloneOfArray1);
        int[] cloneOfArray2 = copyOf(array,10);
        print(cloneOfArray2);
    }

    public static int[] copyOf(int[] array) {
        int[] cloneOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            cloneOfArray[i] = array[i];
        return cloneOfArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] cloneOfArray = new int[newLength];
        for (int i = 0; i < array.length; i++)
            cloneOfArray[i] = array[i];
        for (int i = array.length; i < newLength; i++)
            cloneOfArray[i] = 0;
        return cloneOfArray;
    }

    static void print(int[] array) {
        System.out.println();
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
