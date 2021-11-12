public class TrigonometricSeries {
    public static void main(String[] args) {
        double[] testValue = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2};
        for (int i = 0; i < testValue.length; i++)
            System.out.printf("sin(%.5f)=%f Math.sin(%.5f)=%f \n",
                    testValue[i], sin(testValue[i], 10), testValue[i], Math.sin(testValue[i]));
        System.out.println();
        for (int i = 0; i < testValue.length; i++)
            System.out.printf("cos(%.5f)=%f Math.cos(%.5f)=%f \n",
                    testValue[i], cos(testValue[i], 10), testValue[i], Math.cos(testValue[i]));

    }

    public static double sin(double x, int numTerms) {
        while (x > 2 * Math.PI) {
            x -= 2 * Math.PI;
        }
        double sum = x;
        double temp = x;
        for (int i = 1; i < numTerms; i++) {
            temp = temp * -1 * x * x / ((2 * i + 1) * 2 * i);
            sum += temp;
        }
        return sum;
    }

    public static double cos(double x, int numTerms) {
        while (x > 2 * Math.PI) {
            x -= 2 * Math.PI;
        }
        double sum = 1;
        double temp = 1;
        for (int i = 1; i < numTerms; i++) {
            temp = temp * -1 * x * x / ((2 * i - 1) * 2 * i);
            sum += temp;
        }
        return sum;
    }
}
