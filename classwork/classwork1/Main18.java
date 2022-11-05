import java.util.*;
// Пузырьковый поиск

public class Main18{
	public static int[] sort(int [] a){
		for(int i = 0; i < a.length; i++){
			for(int j = i; j < a.length; j++){
				int tmp = 0;
				if(a[j] < a[i]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of numbers: ");
		int len = scanner.nextInt();
		int[] a = new int[len];
		for (int i = 0; i < len; i++){
			a[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.print(Arrays.toString(sort(a)));
	}
}
