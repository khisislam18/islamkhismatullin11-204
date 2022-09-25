import java.util.Scanner;

public class Main4{
	public static boolean primeNum(int temp){
		for (int i = 3; i < temp; i += 2){
			if (temp % i == 0){
				return false;
			}
		}
		return true;

	}


	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		if (a > b){
			a = a + b;
			b = a - b;
			a = a - b;
		}
		for (int i = a; i <= b; i++){
			if (i == 1 || i == 2 || (i % 2 != 0 && primeNum(i))){
				System.out.print(i + " ");
			}
		}
	}
}