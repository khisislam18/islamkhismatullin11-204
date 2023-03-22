import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;

public class MySet<T> extends AbstractSet<T> implements SortedSet<T> {
    private T [] array;
    private Comparator<T> comparator;
    private int count;
    private Class tClass;

    public MySet(Comparator<T> comparator, Class<T> tClass) {
        array = (T[]) Array.newInstance(tClass, 0);
        this.comparator = comparator;
        this.tClass = tClass;
    }

    public MySet(Comparator<T> comparator, Collection<T> collection, Class<T> tClass) {
        array = (T[]) Array.newInstance(tClass, collection.stream().distinct().toArray().length);
        this.comparator = comparator;
        this.tClass = tClass;
        for (T tmp: collection) {
            if(!arrayContains(tmp)){
                array[count++] = tmp;
            }
        }
        Arrays.sort(array, comparator);
    }
    private boolean arrayContains(T elem){
        for (int i = 0; i < count; i++) {
            if(array[i].equals(elem)){
                return true;
            }
        }
        return false;
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
        SortedSet<T> set = new MySet<T>(comparator(), tClass);
        if(fromElement.equals(toElement)){
            throw new IllegalArgumentException("fromElement equals toElement");
        }
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(fromElement)) {
                do {
                    set.add(array[i]);
                    i++;
                    if(i == size()){
                        throw new IllegalArgumentException("no such element toElement ahead fromElement");
                    }
                } while (!array[i].equals(toElement));
                break;
            }
            if(i == size() - 1){
                throw new IllegalArgumentException("no such element fromElement");
            }
        }
        return set;
    }

    @Override
    public SortedSet<T> headSet(T toElement) {
        SortedSet<T> set = new MySet<T>(comparator(), tClass);
        if(array[0].equals(toElement)){
            return set;
        }
        int i = 0;
        do {
            if(i == count - 1){
                throw new IllegalArgumentException("no such a element");
            }
            set.add(array[i]);
            i++;
        } while (!array[i].equals(toElement));
        return set;
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        SortedSet<T> set = new MySet<T>(comparator(), tClass);
        for (int i = 0; i < size(); i++) {
            if(array[i].equals(fromElement)){
                while(i < size()){
                    set.add(array[i]);
                    i++;
                }
                break;
            }
            if (i == size() - 1){
                throw new IllegalArgumentException("no such a element");
            }
        }
        return set;
    }

    @Override
    public T first() {
        return array[0];
    }

    @Override
    public T last() {
        return array[size() - 1];
    }
    @Override
    public boolean add(T elem){
        if(arrayContains(elem)){
            return false;
        }
        T [] newArray = (T[]) Array.newInstance(tClass, count + 1);
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        newArray[count++] = elem;
        array = newArray;
        Arrays.sort(array, comparator);
        return true;
    }
}
