
public class Print {
    public static void main(String[] args) {

        int[] intTestOne = {1};
        float[] floatTestOne = {1.1F};
        double[] doubleTestOne = {1.1};

        int[] intTestEmp = {};
        float[] floatTestEmp = {};
        double[] doubleTestEmp = {};

        int[] intTestMul = {1, 2, 3, 4, 5};
        float[] floatTestMul = {1.1F, 2.2F, 3.3F, 4.4F, 5.5F};
        double[] doubleTestMul = {1.1, 2.2, 3.3, 4.4, 5.5};

        print(doubleTestOne);
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

    static void print(float[] array) {
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

    static void print(double[] array) {
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
