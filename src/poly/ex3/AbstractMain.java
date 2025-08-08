package poly.ex3;

public class AbstractMain {

//    AbstractAnimal animal = new AbstractAnimal();

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }
}
