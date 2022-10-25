import java.util.*;

public class Main4{
	public static boolean checkBlackArea(int n, int i, int j){
		return i >= j && i + j <= n - 1 || i <= j && i + j >= n - 1 || i == j;
	}

	public static int sumBlackAreas(int [][] matrix){
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				if(checkBlackArea(matrix.length, i, j)){
					sum += matrix[i][j];
				}
			}
		} 
		return sum;
	} 

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter numbers");
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Sum = " + sumBlackAreas(matrix));
	}
}