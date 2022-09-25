import java.util.Scanner;

public class Main2{
		public static int numConverter(int x, int k){
			int num = 0;
			int i = 0;
			while(x > 0){
				num += x % k * Math.pow(10, i);
				i++;
				x /= k;  
			}
			return num;
		}


		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			int k = scanner.nextInt();
			if (k < 2 || k > 9){
				System.out.println("Incorrect input. Please, try another.");
			}else{
				System.out.println(numConverter(x, k));
			}	
	}
}