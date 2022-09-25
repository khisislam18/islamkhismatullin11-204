import java.util.Scanner;

public class Main5{
	public static boolean eqsCompare(int x, int y, int z, int n){
		return Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) == n;
	}

	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 1; Math.pow(i,2) <= n - 2; i++){
			for(int j = i; Math.pow(j,2) <= n - 2; j++){
				for(int k = j; Math.pow(k,2) <= n - 2; k++){
					if (eqsCompare(i,j,k,n)) {
						System.out.println("Yes!\n" + "x = " + i + "\ny = " + j + "\nz = " + k);
						System.exit(0);
					}
				}
			}
		}		
		System.out.println("No :(");
	}
}