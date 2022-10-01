import java.util.*;

public class Main2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any word: ");
		String word = scanner.nextLine();
		char[] arr = word.toCharArray();
		char[] arr2 = new char[arr.length];
		for(int i = 0; i < arr.length; i++){
			arr2[i] = arr[arr.length-i-1];
		}
		System.out.println("Vice versa: " + String.valueOf(arr2));
	}
}
