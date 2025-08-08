package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("Chicken.fly");
    }

    @Override
    public void sound() {
        System.out.println("Chicken.sound");
    }
}
