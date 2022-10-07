import java.util.*;


public class Main19{
	public static int binarySearch(int[] arr, int x){
		int l = 0;
		int r = arr.length - 1;
		int mid;
		while(mid > 0 || mid < arr.length - 1){
			mid = ((l + r) / 2)
			if()
		}

	}
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
