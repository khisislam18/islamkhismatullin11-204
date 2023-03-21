package Task234;

import java.util.Iterator;

public class IteratorBackwards<T> implements Iterator<T> {
    private T[] elem;
    private int current;

    public IteratorBackwards(T[] elem) {
        this.elem = elem;
        current = nonNullElemInd();
    }

    @Override
    public boolean hasNext() {
        return current >= 0;
    }

    @Override
    public T next() {
        return elem[current--];
    }
    public int nonNullElemInd(){
        for (int i = elem.length - 1; i >= 0; i--) {
            if(elem[i] != null){
                return i;
            }
        }
        return -1;
    }
}
