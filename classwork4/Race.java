public class Race {
    public static void start(Car car1, Car car2, int dur){
        int distance1 = dur >= 3 ? car1.speedFirst3Minutes * 3 + car1.speedAfter * (dur - 3) : car1.speedFirst3Minutes * dur;
        System.out.println(car1 + " has raced " + distance1);
        int distance2 = dur >= 3 ? car2.speedFirst3Minutes * 3 + car2.speedAfter * (dur - 3) : car2.speedFirst3Minutes * dur;
        System.out.println(car2 + " has raced " + distance2);
        if(distance1 > distance2){
            car1.beep();
        }else if(distance1 < distance2){
            car2.beep();
        }else{
            car1.beep();
            car2.beep();
        }
    }
}
