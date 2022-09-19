import java.util.Scanner;

public class MainHW3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for factorial calculation:");
		int num = scanner.nextInt();
		if (num >= 24){
			System.out.println("Very big number for calculation, try another");
		}else{
			long fact = 1;
			for(int i = num; i > 0; i--){
				fact *= i;
			}
			System.out.println("Factorial of " + num + " is: " + fact);
		}
	}
}