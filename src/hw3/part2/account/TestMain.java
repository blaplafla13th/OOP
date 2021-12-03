package hw3.part2.account;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1312, "pbt", 'm');
        Customer customer2 = new Customer(511, "ptn", 'f');
        System.out.println(customer1);
        System.out.println(customer2.getGender());
        System.out.println(customer2.getID());
        System.out.println(customer2.getName());

        Account account1 = new Account(1312, customer1);
        Account account2 = new Account(511, customer2, 5000);

        System.out.println(account2);
        System.out.println(account2.getBalance());
        System.out.println(account2.getId());
        System.out.println(account2.getCustomer());
        System.out.println(account2.getCustomerName());

        account1.setBalance(1000);
        System.out.println(account1);

        System.out.println(account1.withdraw(2000));
        System.out.println(account2.withdraw(2000));
        System.out.println(account1.deposite(1000));
    }
}
