import java.util.Scanner;

public class Main1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println(x <= 0 ? 0 : x <= 1 ?  x : Math.pow(x,4));
			
	}
}