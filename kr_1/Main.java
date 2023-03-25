import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static class MyStack<T> extends AbstractCollection<T>{
        private List<T> list = new ArrayList<>();


        @Override
        public Iterator<T> iterator() {
            return list.iterator();
        }

        @Override
        public int size() {
            return list.size();
        }
        public T push(T elem){
            list.add(elem);
            return elem;
        }
        public T pop(){
            T tmp = list.get(size() - 1);
            list.remove(list.size() - 1);
            return tmp;
        }
        public T peek(){
            return list.get(list.size() - 1);
        }
        public boolean empty(){
            return list.size() == 0;
        }
        public int search(T elem){
            return list.indexOf(elem);
        }

        @Override
        public String toString() {
            return "MyStack{" +
                    "list=" + list +
                    '}';
        }
    }
    public static class MyIterator implements Iterator<Car>{
        private int count;
        private List<Car> list;

        public MyIterator(Collection<Car> collection) {
            list = new ArrayList<>();
            Iterator<Car> iterator = collection.iterator();
            while(iterator.hasNext()){
                Car currElem = iterator.next();
                if(currElem.kmsDriven < 30000){
                    list.add(currElem);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return count < list.size() - 1;
        }

        @Override
        public Car next() {
            return list.get(count++);
        }
    }
    public static class Car{
        Integer year;
        Integer kmsDriven;
        String fuelType;
        String suspension;
        Double price;
        String carModel;

        public Car(Integer year, Integer kmsDriven, String fuelType, String suspension, Double price, String carModel) {
            this.year = year;
            this.kmsDriven = kmsDriven;
            this.fuelType = fuelType;
            this.suspension = suspension;
            this.price = price;
            this.carModel = carModel;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "year=" + year +
                    ", kmsDriven=" + kmsDriven +
                    ", fuelType='" + fuelType + '\'' +
                    ", suspension='" + suspension + '\'' +
                    ", price=" + price +
                    ", carModel='" + carModel + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("honda.csv"));
        MyStack<Car> stack = new MyStack<Car>();
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] str = scanner.nextLine().split(",");
            stack.push(new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1].split(" ")[0]), str[2], str[3], Double.parseDouble(str[4].split(" ")[0]), str[5]));
        }
        List<Car> sortedCar = stack.stream().sorted((o1, o2) -> o1.kmsDriven.compareTo(o2.kmsDriven)).toList();
        System.out.println(sortedCar.stream().filter(x -> x.fuelType.equals("Petrol")).min((o1, o2) -> o1.price.compareTo(o2.price)).get());
    }
}
