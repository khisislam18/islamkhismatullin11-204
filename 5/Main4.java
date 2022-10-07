import java.util.*;


public class Main4{
	public static boolean mainDiagonalParity(int[][] matrix){
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			sum += matrix[i][i];
		}
		if(sum % 2 == 0){
			return true;
		}
		else{
			return false;
		}
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
		System.out.println(mainDiagonalParity(matrix));
	}
}
