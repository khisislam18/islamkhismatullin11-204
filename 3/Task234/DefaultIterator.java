package Task234;

import java.util.Arrays;
import java.util.Iterator;

public class DefaultIterator<T> implements Iterator<T> {
    private T[] elem;
    private int current;

    public DefaultIterator(T[] elem) {
        this.elem = elem;
    }

    @Override
    public boolean hasNext() {
        return current < elem.length && elem[current] != null;
    }

    @Override
    public T next() {
        return elem[current++];
    }

    @Override
    public void remove() {
        current--;
        for (int i = current; i < elem.length - 1; i++) {
            T tmp = elem[i];
            elem[i] = elem[i + 1];
            elem[i + 1] = tmp;
            System.out.println(Arrays.toString(elem));
            System.out.println(elem.length);
        }
        elem[elem.length - 1] = null;
    }
}