package hw5.people;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("A", "a", "a", 3, 5);
        Staff staff = new Staff("B", "b", "b", 5);
        System.out.println(student);
        System.out.println(staff);
    }
}
