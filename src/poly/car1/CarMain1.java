package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // k3 -> model3
        Model3Car model = new Model3Car();
        driver.setCar(model);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
