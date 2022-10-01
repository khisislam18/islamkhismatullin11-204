import java.util.*;

public class Main1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of numbers: ");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		for (int i = 1; i <= num; i++){
			System.out.print("The number " + i + " is: ");
			arr[i - 1] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			if(Math.abs(arr[i]) % 2 == 1){
				sum += arr[i];
			}
		}
		System.out.println("Sum of odd numbers = " + sum);
	}
}
