package hw3.part2.invoice;

public class Customer {
    private int id;
    private String name;
    private int discount;

    @Override
    public String toString() {
        return name + '(' + id + ")(" + discount + "%)";
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
}
