public class Main1 {
    public static void main(String[] args) {
        Car car1 = new CasualCar(100, 150);
        Car car2 = new CarF1(60, 220);
        Race.start(car1, car2, 2);
    }
}
