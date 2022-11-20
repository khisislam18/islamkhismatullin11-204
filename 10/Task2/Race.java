import java.io.*;

public class Race {
    public static void start(Car car1, Car car2, Car car3, int dur) {
        int distance1 = car1.countDistance(dur);
        System.out.println(car1 + " has raced " + distance1);
        int distance2 = car2.countDistance(dur);
        System.out.println(car2 + " has raced " + distance2);
        int distance3 = car3.countDistance(dur);
        System.out.println(car3 + " has raced " + distance3);
        if(distance1 >= distance2 && distance1 >= distance3){
            car1.beep();
        }
        if(distance2 >= distance1 && distance2 >= distance3){
            car2.beep();
        }
        if(distance3 >= distance1 && distance3 >= distance2){
            car3.beep();
        }
    }
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
