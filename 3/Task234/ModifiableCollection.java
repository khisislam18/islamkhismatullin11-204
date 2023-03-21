package Task234;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class ModifiableCollection<T> extends AbstractCollection<T> {
    private T[] array;

    public ModifiableCollection(Class<T> tClass, Collection<T> collection){
        array = (T[]) Array.newInstance(tClass, 10000);
        Iterator<T> iterator = collection.iterator();
        int ind = 0;
        while(iterator.hasNext()){
            array[ind++] = iterator.next();
        }
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        DefaultIterator<T> iterator = new DefaultIterator<>(array);
        String str = "[" + iterator.next();
        while(iterator.hasNext()){
            T elem = iterator.next();
            if(elem == null){
                break;
            }
            str += ", " + elem;
        }
        return str + "]";
    }

    @Override
    public Iterator<T> iterator() {
        return new DefaultIterator<>(array);
    }


    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean add(T o) {
        array[size()] = o;
        return true;
    }

    @Override
    public int size() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                return i;
            }
        }
        return array.length;
    }
    public void sort(Comparator<T> comparator){
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            T min = array[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], min) < 0) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}
