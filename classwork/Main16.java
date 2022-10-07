import java.util.*;

public class Main16{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of numbers: ");
		int len = scanner.nextInt();
		int[] a = new int[len];
		for (int i = 0; i < len; i++){
			a[i] = scanner.nextInt();
		}
		int sum = 0;
		int count = 0;
		for (int i = 0; i < len; i+=2){
			sum += a[i];
			count += 1;
		}
		System.out.println("Average: " + (sum)/count);
	}
}
