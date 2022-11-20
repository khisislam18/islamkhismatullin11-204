public class BoostedCar extends Car{
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
    public int countDistance(int duration) throws IllegalArgumentException {
        int sumDistance = duration >= 3 ? speedFirst3Minutes * 3 + speedAfter * (duration - 3) : speedFirst3Minutes * duration;
        if(boostStartTime == -1){
            return sumDistance;
        }
        if(boostStartTime == 0){
            throw new IllegalArgumentException("Boost start time cant be equal to 0, the 1st time start race = '1'");
        }
        int [] arrSpeed = new int[duration];
        for (int i = 0; i < duration; i++) {
            arrSpeed[i] = i < 3 ? speedFirst3Minutes : speedAfter;
        }
        int boostEndTime = boostStartTime + 2;
        for (int i = boostStartTime - 1; boostEndTime < duration ? i < boostEndTime : i < duration; i++) {
            sumDistance += arrSpeed[i];
        }
        return sumDistance;
    }
}
