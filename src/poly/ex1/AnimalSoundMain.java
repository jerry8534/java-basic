package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("test start");
        dog.sound();
        System.out.println("test end");

        System.out.println("test start");
        cat.sound();
        System.out.println("test end");

        soundCow(cow);
    }

    private static void soundCat(Cat cat) {
        System.out.println("test start");
        cat.sound();
        System.out.println("test end");
    }

    private static void soundCow(Cow cow) {
        System.out.println("test start");
        cow.sound();
        System.out.println("test end");
    }
}
