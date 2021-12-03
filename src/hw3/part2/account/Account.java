package hw3.part2.account;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer + " " + "balance=$" + Math.round(balance * 100.0) / 100.0;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposite(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("amount withdrawn exceeds the current balance");
        return this;
    }
}
