public class Main2 {
    public static void main(String[] args) {
        Car car1 = new CasualCar(150, 150);
        Car car2 = new CarF1(50, 300);
        Car car3 = new BoostedCar(50, 100, 6);
        Race.start(car1, car2, car3, 5);
    }
}
