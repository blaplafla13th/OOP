package hw4.part1.polynomial;

public class MyPolynomialTest {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.2, 2.3, 3.4, 4.5);
        /*double[] coeffs = {5.6, 6.7, 7.8, 8.9, 9.0};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs);

        System.out.println(polynomial1);
        System.out.println(polynomial2);
        polynomial1.getDegree();
        System.out.println(polynomial1.add(polynomial2));
        polynomial2.add(polynomial2);
        System.out.println(polynomial2);
        System.out.println(polynomial1.multiply(polynomial2));*/
        System.out.println(polynomial1.evaluate(3));
    }
}
