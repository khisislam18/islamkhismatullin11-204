package Task234;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ModifiableCollection<Integer> collection = new ModifiableCollection<>(Integer.class, new LinkedList<>());
        collection.add(1);
        collection.add(1);
        collection.add(2);
        collection.add(2);
        collection.add(4);
        collection.add(4);
        collection.add(5);
        collection.add(5);
        collection.add(6);
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.remove(6);
        System.out.println(collection);
        ModifiableCollection<Integer> collection1 = new ModifiableCollection<>(Integer.class, new LinkedList<>());
        collection1.add(1);
        collection1.add(2);
        collection1.add(4);
        collection1.add(5);
        System.out.println(collection1);
        collection.removeAll(collection1);
        System.out.println(collection);
        System.out.println(collection.size());
        Iterator<Integer> integerIterator = collection1.iterator();
    }
}
