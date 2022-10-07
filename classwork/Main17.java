import java.util.*;

public class Main17{
	public static boolean sumCheck(int x, int y, int z){
		if(x + y == z){
			return true;
		}
		return false;
	}

	public static boolean fibanaciCheck(int arr){
			if(Math.sqrt(5 * Math.pow(arr, 2) + 4) == (int)(Math.sqrt(5 * Math.pow(arr, 2) + 4)) 
			|| Math.sqrt(5 * Math.pow(arr, 2) - 4) == (int)(Math.sqrt(5 * Math.pow(arr, 2) - 4))){
				return true;
			}
			return false;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of numbers: ");
		int len = scanner.nextInt();
		int[] a = new int[len];
		for (int i = 0; i < len; i++){
			a[i] = scanner.nextInt();
		}
		boolean check = false;
		for(int i = 2; i < len - 2; i++){
			if(sumCheck(a[i], a[i+1], a[i+2])){
				check = fibanaciCheck(a[i]);
			}
		}
		System.out.println(check ? "Yes, it's fibanaci!": "No, it's not!");
	}
}
