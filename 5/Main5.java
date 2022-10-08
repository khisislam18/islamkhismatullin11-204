import java.util.*;
// Сортировка выбором двумерного массива(матрицы)

public class Main5{
	public static void minElementSwap(int[][] matrix, int a, int b){
		int min = Integer.MAX_VALUE;
		int minIndI = matrix.length - 1;
		int minIndJ = matrix.length - 1;
		boolean tmp = true;
		for(int i = a; i < matrix.length; i++){
			for(int j = tmp ? b : 0; j < matrix.length; j++){
				if(min > matrix[i][j]){
					min = matrix[i][j];
					minIndI = i;
					minIndJ = j;
				}
			}
			tmp = false;
		}
		matrix[minIndI][minIndJ] = matrix[a][b];
		matrix[a][b] = min;
	}


	public static int[][] selectionSort(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				minElementSwap(matrix, i, j);
			}
		}
		return matrix;
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
		System.out.println("Sorted matrix:");
		printMatrix(selectionSort(matrix));
	}
}
