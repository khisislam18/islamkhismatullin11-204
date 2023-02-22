import java.util.Comparator;

public class Node<T>  {
    private T value;
    private Node<T> next;


    public T getValue() {
        return value;
    }

    public void setValue(T value) throws NullPointerException {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
