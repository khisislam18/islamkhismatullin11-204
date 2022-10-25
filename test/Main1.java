import java.util.*;

public class Main1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter X: ");
		double x = scanner.nextDouble();
		System.out.print("Enter Y: ");
		double y = scanner.nextDouble();
		if(Math.log(x)/Math.log(2) + Math.abs(y) == 2){
			System.out.println("Yes!");
		}else{
			System.out.println("No!");
		}
	}
}