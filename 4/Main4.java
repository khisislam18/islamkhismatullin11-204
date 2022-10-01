import java.util.*;

public class Main4{
	public static boolean progression(int[] arr, int d, int n){
		for(int i = 2; i < n; i++){
			if(arr[i] - arr[i - 1] != d){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int amount = scanner.nextInt();
		int[] arr = new int[amount];
		for(int i = 0; i < amount; i++){
			System.out.print("a" + (i + 1) + " = ");
			arr[i] = scanner.nextInt();
		}
		int d = arr[1] - arr[0];
		System.out.println(progression(arr, d, amount) ? "Yes, it is!\nd = " + d: "No, it doesn't...");
	}
}
