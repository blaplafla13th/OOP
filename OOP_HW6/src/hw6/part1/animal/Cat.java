package hw6.part1.animal;

public class Cat extends Animal {
    @Override
    public void greets() {
        System.out.println("Meow");
    }

    public Cat(String name) {
        super(name);
    }

}
