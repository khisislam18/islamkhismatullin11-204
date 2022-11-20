import java.io.*;

public class Race {
    public static void start(Car[] cars, int dur){
        int maxDur = 0;
        int maxInd = 0;
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].countDistance(dur));
            if(cars[i].countDistance(dur) > maxDur){
                maxDur = cars[i].countDistance(dur);
                maxInd = i;
            }
        }
        System.out.println("Race winner is the car number " + (maxInd + 1) + "(index " + maxInd + ")");
        cars[maxInd].beep();
    }
}
