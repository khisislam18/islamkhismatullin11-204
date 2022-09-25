import java.util.Scanner;

public class Main3{
		public static int unitsCounter(long num) {
			int counter = 0;
			while (num > 0){
				counter = num % 10 == 1 ? counter + 1: counter;
				num /= 10;
			}

			return counter;
		}
		

		public static boolean numConverter(long x, int k){
			long num = 0;
			int i = 0;
			while(x > 0){
				num += x % k * Math.pow(10, i);
				i++;
				x /= k;  
			}
			System.out.println("Converted number is: " + num);
			return unitsCounter(num) > 3;
		}


		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			long x = scanner.nextLong();
			int k = scanner.nextInt();
			if (k < 2 || k > 9){
				System.out.println("Incorrect input. Please, try another.");
			}else{
				System.out.println(numConverter(x, k) ? "count more than 3" : "count less than 3");
			}	
	}
}