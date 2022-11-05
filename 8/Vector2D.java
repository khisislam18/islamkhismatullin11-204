
public class Vector2D {
    private double x;
    private double y;

    Vector2D() {
        x = 0;
        y = 0;
    }

    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Vector2D add(Vector2D vector) {
        return new Vector2D(x + vector.getX(), y + vector.getY());
    }

    void add2(Vector2D vector) {
        x += vector.getX();
        y += vector.getY();
    }

    Vector2D sub(Vector2D vector) {
        return new Vector2D(x - vector.getX(), y - vector.getY());
    }

    void sub2(Vector2D vector) {
        x -= vector.getX();
        y -= vector.getY();
    }

    void mult2(double k) {
        x *= k;
        y *= k;
    }

    Vector2D mult(double k) {
        return new Vector2D(k * x, k * y);
    }

    public String toString() {
        return "Vector {" + x + ", " + y + "}, it's length : " + length();
    }

    double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    double scalarProduct(Vector2D vector) {
        return x * vector.x + y * vector.y;
    }

    double cos(Vector2D vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    boolean equals(Vector2D vector) {
        return x == vector.x && y == vector.y;
    }
}
