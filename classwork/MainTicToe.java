import java.util.*;


public class MainTicToe{
	public static boolean function(int[][] matrix){
		return;
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
		char [][] matrix = new char[k][k];
		for(int i = 0; i < k; i++){
			for (int j = 0; j < k; j++){
				matrix[i][j] = "_";
			}
		}
		printMatrix(matrix);

	}
}