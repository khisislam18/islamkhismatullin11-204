import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(2);
        integer.add(1);
        UnmodifiableCollection<Integer> collection = new UnmodifiableCollection<>(integer);
    }
}
