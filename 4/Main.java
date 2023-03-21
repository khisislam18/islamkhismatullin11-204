import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        SortedSet<Integer> set = new MySet<>(comparator, list, Integer.class);
        SortedSet<Integer> subSet = set.subSet(0,0);
        System.out.println(set);
        System.out.println(subSet);
        System.out.println(set.tailSet(0));
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
}
