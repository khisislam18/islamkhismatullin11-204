import java.util.*;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Car> list = new MyLinkedList<>();
        list.add(new Car("bmw",1));
        list.add(new Car("mers",2));
        list.add(new Car("tesla", 3));
        list.add(new Car("tesla", 4));
        list.add(new Car("tesla", 5));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        Comparator<Car> comparator = (o1, o2) -> Integer.compare(o2.getYear(), o1.getYear());
        Comparator<Car> comparator1 = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getYear(), o2.getYear());
            }
        };
        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(list);
        list.sort(comparator1);
        System.out.println(list);
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        System.out.println(list2);
        list2.sort(comparator2);
        System.out.println(list2);
    }
}
