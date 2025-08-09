package poly.car1;

public class NewCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("New Car started");
    }

    @Override
    public void offEngine() {
        System.out.println("New Car stopped");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("New Car pressing accelerator");
    }
}
