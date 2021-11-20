package hw6.part1.animal;

public class BigDog extends Dog {
    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww");
    }

    public BigDog(String name) {
        super(name);
    }
}
