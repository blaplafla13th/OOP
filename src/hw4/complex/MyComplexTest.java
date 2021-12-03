package hw4.part1.complex;

public class MyComplexTest {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex();
        MyComplex complex2 = new MyComplex(3.0, 4.8);

        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex2.getReal());
        complex1.setReal(4.4);
        System.out.println(complex1);
        System.out.println(complex1.isReal());

        System.out.println(complex2.getReal());

        System.out.println(complex2);
        System.out.println(complex2.isImagine());

        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex1.equals(complex2));
        System.out.println(complex2.equals(3.0, 4.8));

        System.out.println(complex1.magnitude());
        complex2.setValue(8, 7);
        System.out.println(complex2.argument());
        System.out.println(complex2.conjugate());

        System.out.println(complex1.add(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.addNew(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.subtract(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.subtractNew(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.multiply(complex2));
        System.out.println(complex1.divide(complex2));
        System.out.println(complex2.divide(complex1));
    }
}
