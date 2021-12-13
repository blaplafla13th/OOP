package lab1;

public class PrintDayInWordA {
    public static void main(String[] args) {
        int number=5;
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 0 -> System.out.println("SUNDAY");
        }
    }
}
