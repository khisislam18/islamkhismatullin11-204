package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static class MyIterator implements Iterator<Integer> {
        private int current = 0;
        private List<Integer> list = new ArrayList<>();

        public MyIterator(List<Integer> list) {
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()){
                int tmp = iterator.next();
                if(tmp % 2 == 1){
                    this.list.add(tmp);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return current < list.size();
        }

        @Override
        public Integer next() {
            return list.get(current++);
        }
    }

    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(4);
        integer.add(5);
        integer.add(6);
        integer.add(7);
        integer.add(8);
        integer.add(9);
        MyIterator iterator = new MyIterator(integer);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
