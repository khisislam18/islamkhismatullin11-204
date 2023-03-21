import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\classwork\\4\\covid19_variant.csv"));
        List<Variant> collection = new ArrayList<>();
        sc.nextLine();
        while(sc.hasNext()){
            String current = sc.nextLine();
            String [] currentLine = current.split(",");
            collection.add(new Variant(currentLine[0],
                    currentLine[1],
                    currentLine[2],
                    currentLine[3],
                    Integer.parseInt(currentLine[4]),
                    currentLine[5],
                    currentLine[6],
                    currentLine[7]));
        }
        System.out.println(collection.stream().max((o,u) -> o.specimens.compareTo(u.specimens)));
        System.out.println(collection.stream().min((o,u) -> o.specimens.compareTo(u.specimens)));
        collection.stream().filter(u -> u.specimens >= 5000).forEach(System.out::println);
    }
}
