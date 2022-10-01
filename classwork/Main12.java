import java.util.*;

public class Main12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] a = random.ints(15, -200, 200).toArray();
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++){
			if(Math.abs(a[i] % 3) == 2){
				System.out.print(a[i] + " ");
			}
		}
	}
}
