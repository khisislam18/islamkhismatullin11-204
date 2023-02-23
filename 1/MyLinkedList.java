import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class MyLinkedList<T> {
    private Node<T> firstNode;
    private int size;

    public boolean add(T elem) throws NullPointerException{
        Node<T> newNode = new Node<>();
        Node<T> currentNode = firstNode;
        if(firstNode == null){
            firstNode = newNode;
            newNode.setValue(elem);
        }else{
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            newNode.setValue(elem);
            currentNode.setNext(newNode);
        }
        size++;
        return true;
    }
    public int size(){
        return size;
    }
    public boolean addAll(MyLinkedList<T> linkedList){
        Node<T> currentNode = firstNode;
        if(linkedList.firstNode == null){
            return true;
        }
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        Node<T> currentNode2 = linkedList.firstNode;
        add(currentNode2.getValue());
        int p = 0;
        while(currentNode2.getNext() != null){
            currentNode2 = currentNode2.getNext();
            add(currentNode2.getValue());
        }
        return true;
    }

    public void clear(){
        firstNode = null;
        size = 0;
    }
    public boolean contains(T s){
        Node<T> currentNode = firstNode;
        if(isEmpty()){
            return false;
        }
        while(currentNode.getNext() != null){
            if(currentNode.getValue().equals(s)){
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue().equals(s);
    }
/*    public boolean containsAll(MyLinkedList<T> otherList){
        Node<T> currentNode = firstNode;
        Node<T> currentNodeOtherList = otherList.firstNode;
        while(currentNodeOtherList.getNext() != null){
            boolean flag = false;
            while(currentNode.getNext() != null){
                if(currentNodeOtherList.getValue().equals(currentNode.getValue())){
                    flag = true;
                    break;
                }
                currentNode = currentNode.getNext();
            }
            if(currentNodeOtherList.getValue().equals(currentNode.getValue())){
                flag = true;
            }
            if(!flag){
                return false;
            }
            currentNode = firstNode;
            currentNodeOtherList = currentNodeOtherList.getNext();
        }
        if(currentNodeOtherList.getValue().equals(currentNode.getValue())){
            return true;
        }
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            if(currentNodeOtherList.getValue().equals(currentNode.getValue())){
                return true;
            }
        }
        return false;
    }*/
    public boolean containsAll(MyLinkedList<T> otherList){
        if(otherList.firstNode == null){
            return true;
        }
        if(firstNode == null){
            return false;
        }
        Node<T> currentNodeOtherList = otherList.firstNode;
        boolean flag = false;
        while(currentNodeOtherList.getNext() != null){
            flag = contains(currentNodeOtherList.getValue());
            if(!flag){
                return false;
            }
            currentNodeOtherList = currentNodeOtherList.getNext();
        }
        flag = contains(currentNodeOtherList.getValue());
        return flag;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int indexOf(T s){
        Node<T> currentNode = firstNode;
        if(currentNode.getValue() == s){
            return 0;
        }
        int counter = 1;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            if(currentNode.getValue() == s){
                return counter;
            }
            counter++;
        }
        return -1;
    }
    public T remove(int index){
        if(index < 0 || index > size - 1){
            throw new IllegalArgumentException();
        }
        if(index == 0){
            T tmp = firstNode.getValue();
            firstNode = firstNode.getNext();
            size--;
            return tmp;
        }
        Node<T> previousNode = firstNode;
        Node<T> currentNode = firstNode.getNext();
        for(int i = 1; i < index; i++){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(currentNode.getNext());
        size--;
        return currentNode.getValue();
    }
    public boolean remove(T s){
        if(firstNode.getValue().equals(s)){
            firstNode = firstNode.getNext();
            size--;
            return true;
        }
        Node<T> currentNode = firstNode;
        Node<T> previousNode = null;
        while(currentNode.getNext() != null){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            if(currentNode.getValue().equals(s)){
                previousNode.setNext(currentNode.getNext());
                size--;
                return true;
            }
        }
        size--;
        return false;
    }

    public boolean removeAll(MyLinkedList<T> otherList){
        Node<T> currentNodeOtherList = otherList.firstNode;
        if(currentNodeOtherList == null){
            return true;
        }
        while(currentNodeOtherList.getNext() != null){
            while(contains(currentNodeOtherList.getValue())){
                remove(currentNodeOtherList.getValue());
            }
            currentNodeOtherList = currentNodeOtherList.getNext();
        }
        while(contains(currentNodeOtherList.getValue())){
       /*     System.out.println(currentNodeOtherList.getValue());
            System.out.println(toString());*/
            remove(currentNodeOtherList.getValue());
        }
        return true;
    }
    public int lastIndexOf(T s) {
        if (!contains(s)) {
            return -1;
        }
        Node<T> currentNode = firstNode;
        int position = -1;
        for (int i = 0; currentNode.getNext() != null; i++) {
            if (currentNode.getValue().equals(s)){
                position = i;
            }
            currentNode = currentNode.getNext();
        }
        if(currentNode.getValue().equals(s)){
            position = size - 1;
        }
        return position;
    }
    public T set(int index, T s) {
        if (index > size - 1 ||  index < 0) {
            throw new IllegalArgumentException();
        }
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        T remember = currentNode.getValue();
        currentNode.setValue(s);
        return remember;
    }
    public MyLinkedList<T> sublist(int fromIndex,int toIndex){
        if(fromIndex > toIndex  || fromIndex < 0 || toIndex > size - 1) {
            throw new IllegalArgumentException();
        }
        Node<T> currentNode = firstNode;
        MyLinkedList<T> newSubList = new MyLinkedList<>();
        for (int i = 0; i <= toIndex; i++) {
            if (i >= fromIndex){
                newSubList.add(currentNode.getValue());
            }
            currentNode = currentNode.getNext();
        }
        return newSubList;
    }
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> currentNode = firstNode;
        for (int i = 0; i < size; i++) {
            array[i] = currentNode.getValue();
            currentNode = currentNode.getNext();
        }
        return array;
    }
    public T get(int index){
        Node<T> currentNode = firstNode;
        if(index < 0 || index > size - 1){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }
    public void sort(Comparator<? super T> comparator){
        Node<T> currentNode = firstNode;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(comparator.compare(currentNode.getValue(), currentNode.getNext().getValue()) == 1){
                    T tmp = currentNode.getValue();
                    currentNode.setValue(currentNode.getNext().getValue());
                    currentNode.getNext().setValue(tmp);
                }
                currentNode = currentNode.getNext();
            }
            currentNode = firstNode;
        }
    }


    @Override
    public String toString() {
        if(firstNode == null){
            return "[]";
        }
        String str = "[" + firstNode;
        Node<T> currentNode = firstNode;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            str = str + ", " + currentNode.getValue();
        }
        return str + "]";
    }

    public static void main(String[] args) {
    }
}
