public class MyList {
    private String[] strings = new String[10];
    private int lastFreeIndex = 0;


    private void copyArrays(String[] source, String[] target){
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }

    private void moveToEnd(int index){
        for (int i = index; i < lastFreeIndex - 1; i++) {
            String tmp;
            tmp = strings[i];
            strings[i] = strings[i+1];
            strings[i+1] = tmp;
        }
    }


    public boolean add(String s){
        if (lastFreeIndex+1>=strings.length){
            String[] newArray = new String[strings.length+10];
            copyArrays(strings,newArray);
            strings = newArray;
        }
        strings[lastFreeIndex] = s;
        lastFreeIndex++;
        return true;
    }

    public String get(int index){
        return strings[index];
    }

    public int size(){
        return lastFreeIndex;
    }

    public boolean addAll(MyList otherList){
        for (int i = 0; i < otherList.lastFreeIndex; i++) {
            add(otherList.get(i));
        }
        return true;
    }

    public void clear(){
        lastFreeIndex = 0;
    }
    @Override
    public String toString(){
        String s = "[";
        for (int i = 0; i < lastFreeIndex; i++) {
            s += i + 1 != lastFreeIndex ? get(i) + ", " : get(i);
        }
        s += "]";
        return s;
    }

    public boolean contains(String s){
        for (int i = 0; i < lastFreeIndex; i++) {
            if(s.equals(get(i))){
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(MyList otherList){
        for (int i = 0; i < otherList.lastFreeIndex; i++) {
            if(!contains(otherList.get(i))){
                return false;
            }
        }
        return true;
    }
    public boolean isEmpty(){
        return lastFreeIndex == 0;
    }
    public int indexOf(String s){
        for (int i = 0; i < lastFreeIndex; i++) {
            if(s.equals(get(i))){
                return i;
            }
        }
        return -1;
    }
    public String remove(int index){
        String tmp = get(index);
        moveToEnd(index);
        lastFreeIndex -= 1;
        return tmp;
    }
    public boolean remove(String s){
        if(indexOf(s) == -1){
            return false;
        }
        moveToEnd(indexOf(s));
        lastFreeIndex -= 1;
        return true;
    }
    public boolean removeAll(MyList otherList){
        for (int i = 0; i < otherList.lastFreeIndex; i++) {
            remove(otherList.get(i));
        }
        return true;
    }
}