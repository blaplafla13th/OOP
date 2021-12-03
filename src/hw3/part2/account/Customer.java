package hw3.part2.account;

public class Customer {
    private int ID;
    private String name;
    private char gender;

    @Override
    public String toString() {
        return "name=" + name + '(' + ID + ')';
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        if (gender == 'm' || gender == 'f')
            this.gender = gender;
        else this.gender = 'm';
    }
}
