package hw4.polynomial;

public class MyPolynomialTest {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1, 2, 3, 4);
        double[] coeffs = {5, 6, 7, 8, 9};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs);

        System.out.println(polynomial1); // 4.0x^3 + 3.0x^2 + 2.0x+1.0
        System.out.println(polynomial2); // 9.0x^4 + 8.0x^3 + 7.0x^2 + 6.0x+5.0

        System.out.print(polynomial1.getDegree()); // 3
        System.out.println(polynomial1.add(polynomial2)); //9.0x^4 + 12.0x^3 + 10.0x^2 + 8.0x+6.0

        polynomial2.add(polynomial2);
        System.out.println(polynomial2); // 18.0x^4 + 16.0x^3 + 14.0x^2 + 12.0x+10.0

        polynomial1 = new MyPolynomial(1, 2, 3, 4);
        polynomial2 = new MyPolynomial(coeffs);
        System.out.println(polynomial1.multiply(polynomial2));
        //36.0x^7 + 59.0x^6 + 70.0x^5 + 70.0x^4 + 60.0x^3 + 34.0x^2 + 16.0x+5.0

        System.out.println(polynomial1.evaluate(3)); // 146402.0
    }
}
