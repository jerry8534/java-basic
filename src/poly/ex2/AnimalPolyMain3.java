package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        Animal animala = new Animal();
        animala.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck(), new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }
}
