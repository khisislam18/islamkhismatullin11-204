public class Main1 {
    public static void main(String[] args) {
        Vector2D vector0 = new Vector2D();
        Vector2D vector1 = new Vector2D(5.5, 6.5);
        Vector2D vector2 = new Vector2D(-3, -10);
        Vector2D vector3 = vector1.add(vector2);
        Vector2D vector4 = vector1.sub(vector2);
        vector4.add2(vector3);
        vector0.sub2(vector3);
        Vector2D vector5 = vector0.mult(5);
        vector0.mult2(10);
        System.out.println(vector0.toString());
        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println(vector3.toString());
        System.out.println(vector4.toString());
        System.out.println(vector5.toString());
        System.out.println(vector3.cos(vector0));
        System.out.println(vector5.equals(vector2));
    }
}
