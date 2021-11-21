package hw6.part1.animal;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public BigDog(String name) {
        super(name);
    }
}
