package test.static2;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("E");
        Car car3 = new Car("BMW3");

        Car.showTotalCars();
    }
}
