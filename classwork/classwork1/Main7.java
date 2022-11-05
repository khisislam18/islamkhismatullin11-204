import java.util.Scanner;

public class Main7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String answer = x % 2 == 0 ? "2n":"2n+1";
		System.out.println(answer);
	}
}