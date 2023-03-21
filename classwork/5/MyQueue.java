import java.util.*;

public class MyQueue<T> extends AbstractCollection<T> implements Queue<T> {
    private List<T> list;
    private final int capacity;

    public MyQueue() {
        list = new ArrayList<>();
        capacity = 10;
    }

    public MyQueue(int capacity) {
        list = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean offer(T t) {
        if(capacity <= size()){
            return false;
        }
        return list.add(t);
    }

    @Override
    public T remove() {
        return list.remove(size());
    }

    @Override
    public T poll() {
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.remove(size());
    }

    @Override
    public T element() {
        return list.get(size());
    }

    @Override
    public T peek() {
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(size());
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "list=" + list +
                "}";
    }
}
