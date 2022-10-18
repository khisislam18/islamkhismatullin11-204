import java.util.*;

import class Main3{
	public static int factorial(int x){
		int fact = 1;
		for(int i = 2; i <= x; i++){
			fact *= i;
		}
		return fact;
	}

	public static double equasion(double x, int k, int n){
		return (Math.pow(n, k) + factorial(k)) / Math.pow(x + n, 2 * k) 
	} 

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt(System.in);
		System.out.println("Enter x: ");
		double x = scanner.nextDouble(System.in);
		double sum = 0;
		for(int k = 0; k < n; k++){
			sum += equasion(x, k, n);
		}
		System.out.println("Sum = " + sum);
	}
}