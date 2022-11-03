public class CasualCar extends Car{
    public CasualCar(int speedFirst3Minutes, int speedAfter){
        super(speedFirst3Minutes, speedAfter);
    }
    @Override
    public void beep(){
        System.out.println("beep-beep!!");
    }
}
