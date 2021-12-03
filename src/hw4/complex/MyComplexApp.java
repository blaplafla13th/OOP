package hw4.complex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyComplex[] complexes = new MyComplex[2];
        double a;
        double b;
        for (int i = 1; i < 3; i++) {
            System.out.printf("Enter hw4.complex number %d (real and imaginary part): ", i);
            a = input.nextDouble();
            b = input.nextDouble();
            complexes[i - 1] = new MyComplex(a, b);
        }
        System.out.println();
        String check;
        for (int i = 1; i < 3; i++) {
            System.out.printf("Number is %d: %s%n", i, complexes[i - 1]);
            check = (complexes[i - 1].isReal()) ? "" : "NOT";
            System.out.printf("%s is %s a pure real number%n", complexes[i - 1], check);
            check = (complexes[i - 1].isImagine()) ? "" : "NOT";
            System.out.printf("%s is %s a pure imaginary number%n", complexes[i - 1], check);
            System.out.println();
        }
        check = (complexes[0].equals(complexes[1])) ? "" : "NOT";
        System.out.printf("%s is %s equals to %s%n", complexes[0], check, complexes[1]);
        System.out.printf("%s + %s = %s%n", complexes[0], complexes[1],
                complexes[0].addNew(complexes[1]));
        System.out.printf("%s - %s = %s%n", complexes[0], complexes[1],
                complexes[0].subtractNew(complexes[1]));
        System.out.printf("%s * %s = %s%n", complexes[0], complexes[1],
                complexes[0].multiplyNew(complexes[1]));
        System.out.printf("%s / %s = %s%n", complexes[0], complexes[1],
                complexes[0].divideNew(complexes[1]));

    }
}
