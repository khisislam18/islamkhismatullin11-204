import java.util.List;

public class Common {
    public static double sumPerimeter(List<Rectangle> rectangleArray){
        double sumPerimeter = 0;
        for (Rectangle rectangle:rectangleArray) {
            sumPerimeter += rectangle.perimeter();
        }
        return sumPerimeter;
    }

    public static boolean neighborRectanglesCommonDotsCheck(List<Rectangle> rectangleArray){
        for (int i = 0; i < rectangleArray.size() - 1; i++) {
            if(!rectangleArray.get(i).dotQuality(rectangleArray.get(i+1))){
                return false;
            }
        }
        return true;
    }
}
