package static2.ex;

public class Car {

    private static int totalCars;
    private String name;

    public Car(String name) {
        System.out.println("car buying, name : " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("total cars : " + totalCars);
    }
}
