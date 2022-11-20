public class CarF1 extends Car{
    public CarF1(int speedFirst3Minutes, int speedAfter) {
        super(speedFirst3Minutes, speedAfter);
    }

    @Override
    public void beep() {
        System.out.println("Wroom-wroom!!");
    }
}
