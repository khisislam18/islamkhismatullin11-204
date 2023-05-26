import java.lang.reflect.*;

public class Main {
    public static MyClass setValueByReflection(String className, String fieldName, Integer value) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        Class clazz = Class.forName(className);
        MyClass myClass = new MyClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(myClass, value);
        return myClass;
    }
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getField());
        MyClass myClass1 = setValueByReflection("MyClass", "field", 5);
        System.out.println(myClass1.getField());
    }
}
