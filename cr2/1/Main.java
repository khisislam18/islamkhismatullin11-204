import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Rectangle> rectangleList = new ArrayList<>();
//        int k = scanner.nextInt();
//        for (int i = 0; i < k; i++) {
//            rectangleList.add(i, new Rectangle(Math.random()*10, Math.random()*10,Math.random()*10,Math.random()*10));
//        }
        rectangleList.add(0, new Rectangle(0,5,0,4));
        rectangleList.add(1, new Rectangle(5,10,4,9));
        rectangleList.add(2, new Rectangle(0,5,0,4));
        rectangleList.add(3, new Rectangle(13,15,7,10));

        for (Rectangle rectangle: rectangleList) {
            System.out.println(rectangle);
        }
        int p = 0;
        for (Rectangle rectangle: rectangleList) {
            System.out.println("Rectangle " + p + "square = " + rectangle.square());
            p+=1;
        }
        p = 0;
        for (Rectangle rectangle: rectangleList) {
            System.out.println("Rectangle " + p + "perimeter = " + rectangle.perimeter());
            p+=1;
        }
        for (int i = 1; i < rectangleList.size(); i++) {
            System.out.println("Squares " + (i-1) +" and " + i + " has common dots: ");
            System.out.println(rectangleList.get(i-1).dotQuality(rectangleList.get(i)));
        }
    }
}
