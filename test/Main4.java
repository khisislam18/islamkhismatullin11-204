import java.util.*;

import class Main4{
	public static boolean checkBlackArea(int n, int i, int j){
		return i >= j && i + j <= n - 1 || i <= j && i + j >= n - 1 || i == j;
	}

	public static int sumBlackAreas(int [][] matrix){
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				sum += checkBlackArea(matrix.length, i, j)
			}
		} 
		return sum;
	} 

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt(System.in);
		int[][] matrix = new int[n][n];
		System.out.println("Enter numbers");
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.prinln("Sum = " + sumBlackAreas(matrix));
	}
}