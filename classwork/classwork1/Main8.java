import java.util.Scanner;

public class Main8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String answer = x < 5 ? "small":x < 10 ? "middle":"large";
		System.out.println(answer);
	}
}