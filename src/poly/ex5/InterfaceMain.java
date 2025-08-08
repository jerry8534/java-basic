package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
//        InterfaceAnimal a = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }
}
