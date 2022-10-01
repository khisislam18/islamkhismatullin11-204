import java.util.*;

public class Main14{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
/*		int[] a = random.ints(15, -200, 200).toArray();
		System.out.println(Arrays.toString(a));*/
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		char [] s1A = s1.toCharArray();
		char [] s2A = s2.toCharArray();
		int s1Sum = 0;
		int s2Sum = 0;
		for (int i = 0; i < s1A.length; i++){
			s1Sum += (int)s1A[i];
		}
		for (int i = 0; i < s2A.length; i++){
			s2Sum += (int)s2A[i];
		}
		System.out.println(s1Sum < s2Sum ? s1: s2);
}
