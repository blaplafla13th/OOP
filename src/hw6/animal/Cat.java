package hw6.animal;

public class Cat extends Animal {
    @Override
    public void greets() {
        System.out.println("Meow");
    }

    public Cat(String name) {
        super(name);
    }

}
