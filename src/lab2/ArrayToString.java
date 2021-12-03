package lab2;

public class ArrayToString {
    public static void main(String[] args) {
        int[] intTestOne = {1};
        int[] intTestEmp = {};
        int[] intTestMul = {1, 2, 3, 4, 5};

        System.out.print(arrayToString(intTestMul));
    }

    public static String arrayToString(int[] array) {
        String outStr = "";
        for (int i = 0; i < array.length; i++) {
            outStr += array[i];
        }
        return outStr;
    }
}
