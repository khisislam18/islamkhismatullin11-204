import java.util.*;


public class Main1{
	public static int sumMatrix(int[][] matrix){
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				sum += matrix[i][j];
			}
		}
		return sum;
	}


	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}



	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of elements: ");
		int k = scanner.nextInt();
		int [][] matrix = new int[k][k];
		for(int i = 0; i < k; i++){
			for (int j = 0; j < k; j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		printMatrix(matrix);
		System.out.println("Sum of elements: " + sumMatrix(matrix));
	}
}
