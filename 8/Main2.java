public class Main2 {
    public static void main(String[] args) {
        Car car1 = new CasualCar(-10, 1000);
        Car car2 = new CarF1(250, 190);
        Car car3 = new BoostedCar(50, 300, 9);
        Race.start(car1, car2, car3, 10);
    }
}
