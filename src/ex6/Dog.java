package ex6;

public class Dog extends Pet {
    @Override

    protected Pet clonePet() {
        return new Dog();
    }
}
