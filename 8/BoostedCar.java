public class BoostedCar extends Car {
    int boostStartTime;

    public BoostedCar(int speedFirst3Minutes, int speedAfter) {
        super(speedFirst3Minutes, speedAfter);
        boostStartTime = -1;
    }

    public BoostedCar(int speedFirst3Minutes, int speedAfter, int boostStartTime) {
        this(speedFirst3Minutes, speedAfter);
        this.boostStartTime = boostStartTime;
    }

    @Override
    public void beep() {
        System.out.println("Raaaaugh-Raaaaaugh!!");
    }

    @Override
    public int countDistance(int duration) {
        int [] arrSpeed = new int[duration];
        for (int i = 0; i < duration; i++) {
            arrSpeed[i] = i < 3 ? speedFirst3Minutes : speedAfter;
        }
        int sumDistance = duration >= 3 ? speedFirst3Minutes * 3 + speedAfter * (duration - 3) : speedFirst3Minutes * duration;
        if(boostStartTime == -1){
            return sumDistance;
        }
        int boostEndTime = boostStartTime + 2;
        for (int i = boostStartTime - 1; boostEndTime < duration ? i < boostEndTime : i < duration; i++) {
            sumDistance += arrSpeed[i];
        }
        return sumDistance;
    }
}
