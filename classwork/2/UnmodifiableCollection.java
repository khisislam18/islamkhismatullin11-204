import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class UnmodifiableCollection <T> extends AbstractCollection<T> {
    T[] array;
    public UnmodifiableCollection(Class<T> tClass, Collection<T> collection){
        array = (T[]) Array.newInstance(tClass, 1000);
        Iterator<T> iterator = collection.iterator();
        int ind = 0;
        while(iterator.hasNext()){
            array[ind++] = iterator.next();
        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return array.length;
    }

    public class MyIterator implements Iterator<T>{
        T[] ts;
        int current = 0;
        @Override
        public boolean hasNext() {
            return current < ts.length;
        }

        @Override
        public T next() {
            return ts[current++];
        }
    }
}
