import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> list1 = new ArrayList<>();
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.indexOf("2"));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.indexOf("3"));
        list.add("8");
        list.remove(0);
        System.out.println(list);
        list.remove("5");
        System.out.println(list);
        list.add("1");
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);

        System.out.println("\n--------------------------------------\n");

        MyList myList = new MyList();
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add("1");
        myList.add("2");
        myList.add("3");
        System.out.println(myList.indexOf("2"));
        System.out.println(myList);
        MyList myList1 = new MyList();
        myList1.add("4");
        myList1.add("5");
        myList1.add("6");
        myList.addAll(myList1);
        System.out.println(myList);
        System.out.println(myList.indexOf("2"));
        System.out.println(myList);
        System.out.println(myList.remove(1));
        System.out.println(myList);
        System.out.println(myList.indexOf("3"));
        myList.add("8");
        myList.remove(0);
        System.out.println(myList);
        myList.remove("5");
        System.out.println(myList);
        myList.add("1");
        System.out.println(myList);
        myList.removeAll(myList1);
        System.out.println(myList);
    }
}