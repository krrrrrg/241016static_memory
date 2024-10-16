package test.static2;

public class Car {

    private static int totalCars;
    private String name;

    public Car(String name) {
        System.out.println(name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println(totalCars);
    }
    //void 있으면 리턴값 필요없음!!
}
