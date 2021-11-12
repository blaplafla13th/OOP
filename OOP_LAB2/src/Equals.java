public class Equals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 2, 4};
        int[] array3 = {1, 2, 3, 5};
        int[] array4 = {1, 2, 3};
        if (equals(array1, array3))
            System.out.print("Two arrays are exactly same");
        else
            System.out.print("Two arrays are not same");
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        int[] cloneOfArray1 = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
            cloneOfArray1[i] = array1[i];

        int[] cloneOfArray2 = new int[array2.length];
        for (int i = 0; i < array2.length; i++)
            cloneOfArray2[i] = array2[i];

        sortArray(cloneOfArray1);
        sortArray(cloneOfArray2);

        for (int i = 0; i < array1.length; i++)
            if (cloneOfArray1[i] != cloneOfArray2[i])
                return false;
        return true;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j]>array[j+1]){
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

