import java.util.*;
// Сортировка выбором одномерного массива

public class Main6{
	public static int[] sort(int [] a){
		for(int i = 0; i < a.length; i++){
			int min = a[i];
			int minInd = i;
			for(int j = i; j < a.length; j++){
				if(a[j] < min){
					min = a[j];
					minInd = j;
				}
			}
			a[minInd] = a[i];
			a[i] = min;
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
