import java.util.Scanner;

public class MainHW4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scanner.nextInt();
		System.out.print("Binary number of number " + num + " is: ");
		int mult = 1;
		int maxCount = 0;
		int counter = 0;
		long bin = 1;
		while(num > 0){
			bin = bin * 10 + num % 2;
			num /= 2;
		}
		long binReversed = 0;
		while (bin > 1){
			binReversed = binReversed * 10 + bin % 2;
			if(bin % 2 == 1){
				counter += 1;
			}else if(maxCount < counter){
				maxCount = counter;
				counter = 0;
			}
			bin /= 10;
		}
		if (counter > maxCount){
			maxCount = counter;
		}
		System.out.println(binReversed);
		System.out.println("The biggest amount of gathered units is: " + maxCount);

	}
}	