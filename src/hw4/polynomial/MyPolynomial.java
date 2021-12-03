package hw4.part1.polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String out = "" + coeffs[0];
        for (int i = 1; i < coeffs.length; i++) {
            if (i == 1)
                out = coeffs[i] + "x" + "+" + out;
            else
                out = coeffs[i] + "x^" + i + " + " + out;
        }
        return out;
    }

    public double evaluate(double x) {
        double sum = coeffs[0];
        double item = 1.0;
        for (int i = 1; i < coeffs.length; i++) {
            item *= x;
            sum += coeffs[i] * item;
        }
        return sum;
        /*double result = coeffs[getDegree()];
        for (int i = getDegree() - 1; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;*/
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public MyPolynomial add(MyPolynomial another) {
        double[][] array = {coeffs, another.getCoeffs()};
        int maxDeg = Math.max(array[0].length, array[1].length);
        int maxDegAvai = Math.min(array[0].length, array[1].length);
        int longerArray = (array[0].length > array[1].length) ? 0 : 1;
        double[] result = new double[maxDeg];
        for (int i = 0; i < maxDegAvai; i++) {
            result[i] = array[0][i] + array[1][i];
        }
        for (int i = maxDegAvai; i < maxDeg; i++) {
            result[i] = array[longerArray][i];
        }
        coeffs = result;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        double[] resultCoeffs = new double[coeffs.length + another.getDegree()];
        double[] anotherCoeffs = another.getCoeffs();
        for (int i = 0; i < resultCoeffs.length; i++) {
            double tmp = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j > coeffs.length - 1) {
                    continue;
                }
                if (i - j > anotherCoeffs.length - 1) {
                    continue;
                }
                tmp += coeffs[j] * anotherCoeffs[i - j];
            }
            resultCoeffs[i] = tmp;
        }
        coeffs = resultCoeffs;
        return this;
    }
}
