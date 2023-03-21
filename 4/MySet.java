import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;

public class MySet<T> extends AbstractSet<T> implements SortedSet<T> {
    private T [] array;
    private Comparator<T> comparator;
    private int count;
    private Class tClass;

    public MySet(Comparator<T> comparator, Class<T> tClass) {
        array = (T[]) Array.newInstance(tClass, 1000);
        this.comparator = comparator;
        this.tClass = tClass;
    }

    public MySet(Comparator<T> comparator, Collection<T> collection, Class<T> tClass) {
        array = (T[]) Array.newInstance(tClass, 1000);
        this.comparator = comparator;
        this.tClass = tClass;
        List<T> list = new ArrayList<>();
        for (T tmp: collection) {
            if(!list.contains(tmp)){
                list.add(tmp);
            }
        }
        list.sort(comparator);
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
            count++;
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int iteratorCount;
            @Override
            public boolean hasNext() {
                return iteratorCount < count;
            }

            @Override
            public T next() {
                return array[iteratorCount++];
            }
        };
    }


    @Override
    public int size() {
        return count;
    }

    @Override
    public Comparator<T> comparator() {
        return comparator;
    }

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(fromElement)) {
                do {
                    list.add(array[i]);
                    i++;
                } while (!array[i].equals(toElement));
                list.add(array[i]);
                break;
            }
        }
        return new MySet<T>(comparator(), list, tClass);
    }

    @Override
    public SortedSet<T> headSet(T toElement) {
        List<T> list = new ArrayList<>();
        int i = 0;
        do {
            list.add(array[i]);
            i++;
        } while (!array[i].equals(toElement));
        list.add(array[i]);
        return new MySet<T>(comparator(), list, tClass);
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            if(array[i].equals(fromElement)){
                while(i < size()){
                    list.add(array[i]);
                    i++;
                }
                break;
            }
        }
        return new MySet<T>(comparator(), list, tClass);
    }

    @Override
    public T first() {
        return array[0];
    }

    @Override
    public T last() {
        return array[size() - 1];
    }
    public boolean add(T elem){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(array[i]);
        }
        if(list.contains(elem)){
            return false;
        }
        list.add(elem);
        list.sort(comparator);
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        count++;
        return true;
    }
}
