import java.util.*;


public class Main1{
	public static boolean gameIsNotDone(int[][] matrix){
		
	}


	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}



	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		char [][] matrix = new char[k][k];
		for(int i = 0; i < k; i++){
			for (int j = 0; j < k; j++){
				matrix[i][j] = "_";
			}
		}
		System.out.println("GAME STARTS");
		printMatrix(matrix);
		boolean cond = true;
		while(cond){
			for(int i = 0; i < 2; i++){
				if(gameIsNotDone()){
					cond = false;
					break;
				}
				System.out.print("Player's № " + i + 1 + " turn: ");
				
			}
		}

	}
}