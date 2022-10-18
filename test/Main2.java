import java.util.*;

import class Main2{
	public static boolean check35(int a){
		while(a > 0){
			if(a % 10 == 5 || a % 10 == 3){
				return true;
			}
			a /= 10;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt(System.in);
		System.out.println("Enter " + n + " numbers");
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scanner.nextInt(System.in);
		}
		boolean tmp = false;
		for(int i = 0; i < arr.length; i++){
			tmp = check35(arr[i]); 
		}
		System.out.println(tmp);
	}
}