package poly.ex4;

public class AbstractMain {

//    AbstractAnimal animal = new AbstractAnimal();

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.move();
        System.out.println("test end");
    }
}
