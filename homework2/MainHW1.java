import java.util.Scanner;

public class MainHW1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter 2st number:");
		int num2 = scanner.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Arguments swapper in proccess...");
		System.out.println("1st number is: " + num1);
		System.out.println("2nd number is: " + num2);
		}
	}