package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }
}
