import java.util.Scanner;

public class Main6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String answer = x < 5 ? "<":">=";
		System.out.println(answer);
	}
}