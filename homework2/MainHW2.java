import java.util.Scanner;

public class MainHW2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number of arithmetic progression:");
		int a1 = scanner.nextInt();
		System.out.println("Enter 2nd number of arithmetic progression:");
		int a2 = scanner.nextInt();
		System.out.println("Enter numeric 'k' of arithemtic progression:");
		int k = scanner.nextInt();
		int d = a2 - a1;
		int ak = a1 + d*(k-1);
		System.out.println("Number of numeric k is:");
		System.out.println(ak);
		}
	}