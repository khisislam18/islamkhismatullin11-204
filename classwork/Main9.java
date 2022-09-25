import java.util.Scanner;

public class Main9{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(countSum(x));

	public static int countSum(int x){
		int sum = 0;
		while (x > 0){
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}
	}
}