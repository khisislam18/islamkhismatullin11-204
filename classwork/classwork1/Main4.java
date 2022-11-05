import java.util.Scanner;

public class Main4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextInt();
		double y = scanner.nextInt();
		double r = Math.sqrt(Math.pow(x) + Math.pow(y));
		System.out.println(r);
	}
}