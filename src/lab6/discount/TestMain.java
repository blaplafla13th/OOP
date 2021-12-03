package lab6.discount;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        Customer a = new Customer("a");
        System.out.println(a.getName());
        System.out.println(a.isMember());
        System.out.println(a.getMemberType());
        a.setMember(true);
        a.setMemberType("Gold");
        System.out.println(a);
        System.out.println();

        Visit a1 = new Visit(a, new Date());
        System.out.println(a1.getName());
        a1.setProductExpense(5);
        a1.setServiceExpense(5);
        System.out.println(a1.getProductExpense());
        System.out.println(a1.getServiceExpense());
        System.out.println(a1.getTotalExpense());
        System.out.println(a1);
        System.out.println();

        Visit a2 = new Visit("a", new Date());
        System.out.println(a2.getName());
        a2.setProductExpense(5);
        a2.setServiceExpense(5);
        System.out.println(a2.getProductExpense());
        System.out.println(a2.getServiceExpense());
        System.out.println(a2.getTotalExpense());
        System.out.println(a2);

    }
}
