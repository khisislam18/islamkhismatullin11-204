import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
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
        List<Car> list = new ArrayList<>();
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] str = scanner.nextLine().split(",");
            list.add(new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1].split(" ")[0]), str[2], str[3], Double.parseDouble(str[4].split(" ")[0]), str[5]));
        }
        //1
        list.stream().filter(x -> x.fuelType.equals("Petrol")).filter(x -> x.suspension.equals("Automatic")).toList().forEach(System.out::println);
        //2
        list.stream().map(x->x.price.intValue()).filter(x->x%2==0).forEach(System.out::println);
        //3
        System.out.println("Average price: " + list.stream().mapToDouble(y->y.price).sum() / list.size() + " Lakh\nHigher from average price amount: " +
                list.stream().filter(x->x.price > list.stream().mapToDouble(y->y.price).sum() / list.size()).count());
        //4
        list.stream().filter(x -> x.kmsDriven / (2024 - x.year) < 10000).forEach(System.out::println);
        //5
        System.out.println("Count: " + list.stream().filter(x->x.carModel.split(" ")[0].equals("Honda") && x.carModel.split(" ")[1].equals("City")).filter(x->x.year >= 2015).count());
    }
}
