
import java.util.Scanner;

public class Combine {
    public static Scanner input = new Scanner(System.in);
    public static String[] arrayTest = {"Test"};

    public static void main(String[] args) {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: HW1");
        System.out.println("2: HW2");
        System.out.println("3: HW3");
        System.out.println("4: HW4");
        System.out.println("5: HW5");
        System.out.println("6: HW6");
        System.out.println("7: LAB1");
        System.out.println("8: LAB2");
        System.out.println("0: Exit");
        switch (input()) {
            case 1:
                runHW1();
                break;
            case 2:
                runHW2();
                break;
            case 3:
                runHW3();
                break;
            case 4:
                runHW4();
                break;
            case 5:
                runHW5();
                break;
            case 6:
                runHW6();
                break;
            case 7:
                runLAB1();
                break;
            case 8:
                runLAB2();
                break;
            case 0:
                break;
            default:
                main(arrayTest);
        }
    }

    public static void runHW1() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: Bin2Dec");
        System.out.println("2: BoxPattern");
        System.out.println("3: CeasarCode");
        System.out.println("4: CheckerPattern");
        System.out.println("5: CheckHexStr");
        System.out.println("6: CountVowelsDigits");
        System.out.println("7: DecipherCeasarCode");
        System.out.println("8: ExchangeCipher");
        System.out.println("9: Factorial");
        System.out.println("10: Hex2Dec");
        System.out.println("11: HillPattern");
        System.out.println("12: Oct2Dec");
        System.out.println("13: PhoneKeyPadA");
        System.out.println("14: PhoneKeyPadB");
        System.out.println("15: RadixN2Dec");
        System.out.println("16: RadixN2DecRewrite");
        System.out.println("17: ReverseString");
        System.out.println("18: SquarePattern");
        System.out.println("19: SquarePattern1");
        System.out.println("20: TestPalindromicPhrase");
        System.out.println("21: TimeTable");
        System.out.println("22: TriangularPattern");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                hw1.Bin2Dec.main(arrayTest);
                break;
            case 2:
                hw1.BoxPattern.main(arrayTest);
                break;
            case 3:
                hw1.CeasarCode.main(arrayTest);
                break;
            case 4:
                hw1.CheckerPattern.main(arrayTest);
                break;
            case 5:
                hw1.CheckHexStr.main(arrayTest);
                break;
            case 6:
                hw1.CountVowelsDigits.main(arrayTest);
                break;
            case 7:
                hw1.DecipherCeasarCode.main(arrayTest);
                break;
            case 8:
                hw1.ExchangeCipher.main(arrayTest);
                break;
            case 9:
                hw1.Factorial.main(arrayTest);
                break;
            case 10:
                hw1.Hex2Dec.main(arrayTest);
                break;
            case 11:
                hw1.HillPattern.main(arrayTest);
                break;
            case 12:
                hw1.Oct2Dec.main(arrayTest);
                break;
            case 13:
                hw1.PhoneKeyPadA.main(arrayTest);
                break;
            case 14:
                hw1.PhoneKeyPadB.main(arrayTest);
                break;
            case 15:
                hw1.RadixN2Dec.main(arrayTest);
                break;
            case 16:
                hw1.RadixN2DecRewrite.main(arrayTest);
                break;
            case 17:
                hw1.ReverseString.main(arrayTest);
                break;
            case 18:
                hw1.SquarePattern.main(arrayTest);
                break;
            case 19:
                hw1.SquarePattern1.main(arrayTest);
                break;
            case 20:
                hw1.TestPalindromicPhrase.main(arrayTest);
                break;
            case 21:
                hw1.TimeTable.main(arrayTest);
                break;
            case 22:
                hw1.TriangularPattern.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runHW1();
        }
    }

    public static void runHW2() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: BubbleSort");
        System.out.println("2: DateUtil");
        System.out.println("3: FactorialHandlingOverflow");
        System.out.println("4: FactorialRecursion");
        System.out.println("5: FibonacciIntHandlingOverflow");
        System.out.println("6: FibonacciRecursive");
        System.out.println("7: GCD");
        System.out.println("8: GCDRecursive");
        System.out.println("9: InsertionSort");
        System.out.println("10: LengthOfARunningNumberSequenceRecursive");
        System.out.println("11: LinearSearch");
        System.out.println("12: Matrix");
        System.out.println("13: NumberConversion");
        System.out.println("14: NumberGuest");
        System.out.println("15: PerfectNumberList");
        System.out.println("16: PerfectPrimeFactorList");
        System.out.println("17: PrimeList");
        System.out.println("18: RecursiveBinarySearch");
        System.out.println("19: SelectionSort");
        System.out.println("20: SpecialSeries");
        System.out.println("21: TribonacciIntHandlingOverflow");
        System.out.println("22: TrigonometricSeries");
        System.out.println("23: WordGuess");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                hw2.BubbleSort.main(arrayTest);
                break;
            case 2:
                hw2.DateUtil.main(arrayTest);
                break;
            case 3:
                hw2.FactorialHandlingOverflow.main(arrayTest);
                break;
            case 4:
                hw2.FactorialRecursion.main(arrayTest);
                break;
            case 5:
                hw2.FibonacciIntHandlingOverflow.main(arrayTest);
                break;
            case 6:
                hw2.FibonacciRecursive.main(arrayTest);
                break;
            case 7:
                hw2.GCD.main(arrayTest);
                break;
            case 8:
                hw2.GCDRecursive.main(arrayTest);
                break;
            case 9:
                hw2.InsertionSort.main(arrayTest);
                break;
            case 10:
                hw2.LengthOfARunningNumberSequenceRecursive.main(arrayTest);
                break;
            case 11:
                hw2.LinearSearch.main(arrayTest);
                break;
            case 12:
                hw2.Matrix.main(arrayTest);
                break;
            case 13:
                hw2.NumberConversion.main(arrayTest);
                break;
            case 14:
                hw2.NumberGuest.main(arrayTest);
                break;
            case 15:
                hw2.PerfectNumberList.main(arrayTest);
                break;
            case 16:
                hw2.PerfectPrimeFactorList.main(arrayTest);
                break;
            case 17:
                hw2.PrimeList.main(arrayTest);
                break;
            case 18:
                hw2.RecursiveBinarySearch.main(arrayTest);
                break;
            case 19:
                hw2.SelectionSort.main(arrayTest);
                break;
            case 20:
                hw2.SpecialSeries.main(arrayTest);
                break;
            case 21:
                hw2.TribonacciIntHandlingOverflow.main(arrayTest);
                break;
            case 22:
                hw2.TrigonometricSeries.main(arrayTest);
                break;
            case 23:
                hw2.WordGuess.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runHW2();
        }
    }

    public static void runHW3() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: account TestMain");
        System.out.println("2: ball TestMain");
        System.out.println("3: circle1 TestCircle");
        System.out.println("4: circle2 TestMain");
        System.out.println("5: date TestMain");
        System.out.println("6: employee TestMain");
        System.out.println("7: invoiceitem TestMain");
        System.out.println("8: rectangle TestMain");
        System.out.println("9: time TestMain");
        System.out.println("10: account TestMain");
        System.out.println("11: invoice TestMain");
        System.out.println("12: mypoint MyCircleTest");
        System.out.println("13: mypoint MyLineTest");
        System.out.println("14: mypoint MyPointTest");
        System.out.println("15: mypoint MyRectangleTest");
        System.out.println("16: mypoint MyTriangleTest");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                hw3.part1.account.TestMain.main(arrayTest);
                break;
            case 2:
                hw3.part1.ball.TestMain.main(arrayTest);
                break;
            case 3:
                hw3.part1.circle1.TestCircle.main(arrayTest);
                break;
            case 4:
                hw3.part1.circle2.TestMain.main(arrayTest);
                break;
            case 5:
                hw3.part1.date.TestMain.main(arrayTest);
                break;
            case 6:
                hw3.part1.employee.TestMain.main(arrayTest);
                break;
            case 7:
                hw3.part1.invoiceitem.TestMain.main(arrayTest);
                break;
            case 8:
                hw3.part1.rectangle.TestMain.main(arrayTest);
                break;
            case 9:
                hw3.part1.time.TestMain.main(arrayTest);
                break;
            case 10:
                hw3.part2.account.TestMain.main(arrayTest);
                break;
            case 11:
                hw3.part2.invoice.TestMain.main(arrayTest);
                break;
            case 12:
                hw3.part2.mypoint.MyCircleTest.main(arrayTest);
                break;
            case 13:
                hw3.part2.mypoint.MyLineTest.main(arrayTest);
                break;
            case 14:
                hw3.part2.mypoint.MyPointTest.main(arrayTest);
                break;
            case 15:
                hw3.part2.mypoint.MyRectangleTest.main(arrayTest);
                break;
            case 16:
                hw3.part2.mypoint.MyTriangleTest.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runHW3();
        }
    }

    public static void runHW4() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: ball_player TestBall");
        System.out.println("2: ball_player TestPlayer");
        System.out.println("3: bouncing_ball TestBouncingBall");
        System.out.println("4: complex MyComplexTest");
        System.out.println("5: date MyDateTest");
        System.out.println("6: polynomial MyPolynomialTest");
        System.out.println("7: time TestMyTime");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                hw4.part1.ball_player.TestBall.main(arrayTest);
                break;
            case 2:
                hw4.part1.ball_player.TestPlayer.main(arrayTest);
                break;
            case 3:
                hw4.part1.bouncing_ball.TestBouncingBall.main(arrayTest);
                break;
            case 4:
                hw4.part1.complex.MyComplexTest.main(arrayTest);
                break;
            case 5:
                hw4.part1.date.MyDateTest.main(arrayTest);
                break;
            case 6:
                hw4.part1.polynomial.MyPolynomialTest.main(arrayTest);
                break;
            case 7:
                hw4.part1.time.TestMyTime.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runHW4();
        }
    }

    public static void runHW5() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: animal TestMain");
        System.out.println("2: circle TestCylinder");
        System.out.println("3: people TestPerson");
        System.out.println("4: point TestPoint");
        System.out.println("5: shape CircleTest");
        System.out.println("6: shape RectangleTest");
        System.out.println("7: shape ShapeTest");
        System.out.println("8: shape SquareTest");
        System.out.println("9: circle CylinderTest");
        System.out.println("10: point TestLine");
        System.out.println("11: point TestLineSub");
        System.out.println("12: point TestPoint");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                hw5.part1.animal.TestMain.main(arrayTest);
                break;
            case 2:
                hw5.part1.circle.TestCylinder.main(arrayTest);
                break;
            case 3:
                hw5.part1.people.TestPerson.main(arrayTest);
                break;
            case 4:
                hw5.part1.point.TestPoint.main(arrayTest);
                break;
            case 5:
                hw5.part1.shape.CircleTest.main(arrayTest);
                break;
            case 6:
                hw5.part1.shape.RectangleTest.main(arrayTest);
                break;
            case 7:
                hw5.part1.shape.ShapeTest.main(arrayTest);
                break;
            case 8:
                hw5.part1.shape.SquareTest.main(arrayTest);
                break;
            case 9:
                hw5.part2.circle.CylinderTest.main(arrayTest);
                break;
            case 10:
                hw5.part2.point.TestLine.main(arrayTest);
                break;
            case 11:
                hw5.part2.point.TestLineSub.main(arrayTest);
                break;
            case 12:
                hw5.part2.point.TestPoint.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runHW5();
        }
    }

    public static void runHW6() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: animal TestAnimal");
        System.out.println("2: geometricobject TestMain");
        System.out.println("3: movable TestMovableCircle");
        System.out.println("4: movable TestMovablePoint");
        System.out.println("5: movable TestMovableRectangle");
        System.out.println("6: resizable TestCircle");
        System.out.println("7: resizable TestResizableCircle");
        System.out.println("8: shape TestMain");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                hw6.part1.animal.TestAnimal.main(arrayTest);
                break;
            case 2:
                hw6.part1.geometricobject.TestMain.main(arrayTest);
                break;
            case 3:
                hw6.part1.movable.TestMovableCircle.main(arrayTest);
                break;
            case 4:
                hw6.part1.movable.TestMovablePoint.main(arrayTest);
                break;
            case 5:
                hw6.part1.movable.TestMovableRectangle.main(arrayTest);
                break;
            case 6:
                hw6.part1.resizable.TestCircle.main(arrayTest);
                break;
            case 7:
                hw6.part1.resizable.TestResizableCircle.main(arrayTest);
                break;
            case 8:
                hw6.part1.shape.TestMain.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runHW6();
        }
    }

    public static void runLAB1() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: AverageWithInputValidation");
        System.out.println("2: CheckOddEven");
        System.out.println("3: CheckPassFail");
        System.out.println("4: CircleComputation");
        System.out.println("5: ComputePI12");
        System.out.println("6: ComputerPI");
        System.out.println("7: CylinderComputation");
        System.out.println("8: ExtractDigits");
        System.out.println("9: Fibonacci");
        System.out.println("10: HarmonicSum");
        System.out.println("11: InputValidation");
        System.out.println("12: PensionContributionCalculator");
        System.out.println("13: PensionContributionCalculatorWithSentinel");
        System.out.println("14: PrintDayInWordA");
        System.out.println("15: PrintDayInWordB");
        System.out.println("16: PrintNumberInWordA");
        System.out.println("17: PrintNumberInWordB");
        System.out.println("18: ReverseInt");
        System.out.println("19: SphereComputation");
        System.out.println("20: SumAverageRunningInt");
        System.out.println("21: SumAverageRunningInt1");
        System.out.println("22: SumAverageRunningInt2");
        System.out.println("23: SumAverageRunningInt4");
        System.out.println("24: SumAverageRunningInt5");
        System.out.println("25: SumAverageRunningInt6");
        System.out.println("26: SumProductMinMax3");
        System.out.println("27: SumProductMinMax5");
        System.out.println("28: Tribonacci");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                lab1.AverageWithInputValidation.main(arrayTest);
                break;
            case 2:
                lab1.CheckOddEven.main(arrayTest);
                break;
            case 3:
                lab1.CheckPassFail.main(arrayTest);
                break;
            case 4:
                lab1.CircleComputation.main(arrayTest);
                break;
            case 5:
                lab1.ComputePI12.main(arrayTest);
                break;
            case 6:
                lab1.ComputerPI.main(arrayTest);
                break;
            case 7:
                lab1.CylinderComputation.main(arrayTest);
                break;
            case 8:
                lab1.ExtractDigits.main(arrayTest);
                break;
            case 9:
                lab1.Fibonacci.main(arrayTest);
                break;
            case 10:
                lab1.HarmonicSum.main(arrayTest);
                break;
            case 11:
                lab1.InputValidation.main(arrayTest);
                break;
            case 12:
                lab1.PensionContributionCalculator.main(arrayTest);
                break;
            case 13:
                lab1.PensionContributionCalculatorWithSentinel.main(arrayTest);
                break;
            case 14:
                lab1.PrintDayInWordA.main(arrayTest);
                break;
            case 15:
                lab1.PrintDayInWordB.main(arrayTest);
                break;
            case 16:
                lab1.PrintNumberInWordA.main(arrayTest);
                break;
            case 17:
                lab1.PrintNumberInWordB.main(arrayTest);
                break;
            case 18:
                lab1.ReverseInt.main(arrayTest);
                break;
            case 19:
                lab1.SphereComputation.main(arrayTest);
                break;
            case 20:
                lab1.SumAverageRunningInt.main(arrayTest);
                break;
            case 21:
                lab1.SumAverageRunningInt1.main(arrayTest);
                break;
            case 22:
                lab1.SumAverageRunningInt2.main(arrayTest);
                break;
            case 23:
                lab1.SumAverageRunningInt4.main(arrayTest);
                break;
            case 24:
                lab1.SumAverageRunningInt5.main(arrayTest);
                break;
            case 25:
                lab1.SumAverageRunningInt6.main(arrayTest);
                break;
            case 26:
                lab1.SumProductMinMax3.main(arrayTest);
                break;
            case 27:
                lab1.SumProductMinMax5.main(arrayTest);
                break;
            case 28:
                lab1.Tribonacci.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runLAB1();
        }
    }

    public static void runLAB2() {
        System.out.println("Nhập lựa chọn của bạn:");
        System.out.println("1: ArrayToString");
        System.out.println("2: Contains");
        System.out.println("3: CopyOf");
        System.out.println("4: Dec2Hex");
        System.out.println("5: Equals");
        System.out.println("6: Exponent");
        System.out.println("7: GradesHistogram");
        System.out.println("8: GradesStatistics1_3");
        System.out.println("9: GradesStatistics2_11");
        System.out.println("10: Hex2Bin");
        System.out.println("11: MagicSum");
        System.out.println("12: Print");
        System.out.println("13: PrintArray");
        System.out.println("14: PrintArrayInStars");
        System.out.println("15: Reverse");
        System.out.println("16: Search");
        System.out.println("17: Swap");
        System.out.println("0: Back");
        int i = input();
        System.out.println("Function Run: ");
        switch (i) {
            case 1:
                lab2.ArrayToString.main(arrayTest);
                break;
            case 2:
                lab2.Contains.main(arrayTest);
                break;
            case 3:
                lab2.CopyOf.main(arrayTest);
                break;
            case 4:
                lab2.Dec2Hex.main(arrayTest);
                break;
            case 5:
                lab2.Equals.main(arrayTest);
                break;
            case 6:
                lab2.Exponent.main(arrayTest);
                break;
            case 7:
                lab2.GradesHistogram.main(arrayTest);
                break;
            case 8:
                lab2.GradesStatistics1_3.main(arrayTest);
                break;
            case 9:
                lab2.GradesStatistics2_11.main(arrayTest);
                break;
            case 10:
                lab2.Hex2Bin.main(arrayTest);
                break;
            case 11:
                lab2.MagicSum.main(arrayTest);
                break;
            case 12:
                lab2.Print.main(arrayTest);
                break;
            case 13:
                lab2.PrintArray.main(arrayTest);
                break;
            case 14:
                lab2.PrintArrayInStars.main(arrayTest);
                break;
            case 15:
                lab2.Reverse.main(arrayTest);
                break;
            case 16:
                lab2.Search.main(arrayTest);
                break;
            case 17:
                lab2.Swap.main(arrayTest);
                break;
            case 0:
                main(arrayTest);
                break;
            default:
                runLAB2();
        }
    }

    public static int input() {
        int i;
        try {
            i = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            {
                System.out.println("Không tìm thấy lựa chọn");
                return -1;
            }
        }
        return i;
    }
}
