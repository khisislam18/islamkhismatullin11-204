public class Rectangle {
    private double xStart;
    private double xEnd;
    private double yStart;
    private double yEnd;

    public Rectangle(double xStart, double xEnd, double yStart, double yEnd) {
        this.xStart = xStart;
        this.xEnd = xEnd;
        this.yStart = yStart;
        this.yEnd = yEnd;
    }

    public double getxStart() {
        return xStart;
    }

    public double getxEnd() {
        return xEnd;
    }

    public double getyStart() {
        return yStart;
    }

    public double getyEnd() {
        return yEnd;
    }

    public double square(){
        return Math.abs(xStart - xEnd) * Math.abs(yStart - yEnd);
    }
    public double perimeter(){
        return Math.abs(xStart - xEnd) * 2 + Math.abs(yStart - yEnd) * 2;
    }
    public boolean dotQuality(Rectangle rectangle){
        return xStart == rectangle.getxStart() && yStart == rectangle.getyStart()
                || xStart == rectangle.getxEnd() && yStart == rectangle.getyEnd()
                || xStart == rectangle.getxStart() && yStart == rectangle.getyEnd()
                || xStart == rectangle.getxEnd() && yStart == rectangle.getyStart()
                || xStart == rectangle.getxStart() && yEnd == rectangle.getyStart()
                || xStart == rectangle.getxEnd() && yEnd == rectangle.getyEnd()
                || xStart == rectangle.getxStart() && yEnd == rectangle.getyEnd()
                || xStart == rectangle.getxEnd() && yEnd == rectangle.getyStart()
                || xEnd == rectangle.getxStart() && yStart == rectangle.getyStart()
                || xEnd == rectangle.getxEnd() && yStart == rectangle.getyEnd()
                || xEnd == rectangle.getxEnd() && yStart == rectangle.getyStart()
                || xEnd == rectangle.getxStart() && yStart == rectangle.getyEnd()
                || xEnd == rectangle.getxStart() && yEnd == rectangle.getyStart()
                || xEnd == rectangle.getxEnd() && yEnd == rectangle.getyEnd()
                || xEnd == rectangle.getxEnd() && yEnd == rectangle.getyStart()
                || xEnd == rectangle.getxStart() && yEnd == rectangle.getyEnd();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "xStart=" + xStart +
                ", xEnd=" + xEnd +
                ", yStart=" + yStart +
                ", yEnd=" + yEnd +
                '}';
    }

    public boolean equals(Rectangle rectangle){
        return xStart == rectangle.getxStart() && xEnd == rectangle.getxEnd() && yStart == rectangle.getyStart() && yEnd == rectangle.getyEnd();
    }
}
