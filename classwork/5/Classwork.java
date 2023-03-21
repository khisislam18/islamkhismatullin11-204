import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Classwork {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("popular.csv"));
        scanner.nextLine();
        MyQueue<Channel> channels = new MyQueue<>();
        while(scanner.hasNext()){
            String[] s = scanner.nextLine().split(",");
            channels.offer(new Channel(Integer.parseInt(s[0]), s[2], Double.parseDouble(s[5]), s[8]));
        }
        System.out.println(channels);
        Map<String, List<Channel>> map = channels.stream().collect(Collectors.groupingBy(x -> x.country));
    }
}
