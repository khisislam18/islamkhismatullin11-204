import java.util.Scanner;

public class Main2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextInt();
		double y = scanner.nextInt();
		double r = scanner.nextInt();
		double x0 = scanner.nextInt();
		double y0 = scanner.nextInt();

		if ((x-x0)*(x-x0) + (y-y0)*(y-y0) <= r*r){
			System.out.println("Popal");
		}else{
			System.out.println("Ne Popal");
		}
	}
}