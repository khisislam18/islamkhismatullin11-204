import java.util.*;

public class Main13{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] a = random.ints(15, -200, 200).toArray();
		System.out.println(Arrays.toString(a));
		int max = a[0];
		int min = a[0];
		int maxInd = 0;
		int minInd = 0;
		for(int i = 0; i < a.length; i++){
			if (a[i] > max){
				max = a[i];
				maxInd = i;
			}
			if (min > a[i]){
				min = a[i];
				minInd = i;
			}
		}
		System.out.println("Min -> Max length = " + Math.abs(minInd - maxInd));
	}
}
