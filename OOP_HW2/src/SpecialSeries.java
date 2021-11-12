public class SpecialSeries {
    public static void main(String[] args) {
        double x = 0.5;
        int numTerms = 10;
        double specialSeriesResult = specialSeries(x, numTerms);
        System.out.println(specialSeriesResult);
    }


    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        double tempX = x;
        double temp = 1;
        for (int i = 1; i < numTerms; i++) {
            temp = temp * (2 * i - 1) / (2 * i);
            tempX = tempX * x * x / (2 * i + 1);
            sum += temp * tempX;
        }
        return sum;
    }
}
