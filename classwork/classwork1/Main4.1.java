import java.util.Scanner;

public class Main1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		random.ints(9, -200, 200).forEach(System.out::println);

	}
}