import java.util.*;


public class Main2{
	public static double averageOfElem(int[][] matrix){
		int average = 0;
		int counter = 0;
		for(int i = 0; i < matrix.length; i += 2){
			for(int j = 1; j < matrix.length; j += 2){
				average += matrix[i][j];
				counter++;
			}
		}
		return (double)average/counter;
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
		System.out.println("Average of elements: " + averageOfElem(matrix));
	}
}
