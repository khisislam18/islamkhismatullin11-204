import java.util.*;

public class Main3{
	public static boolean capitalLetter(char[] spell, String[] arr,int i, boolean ch){
			if((int)spell[0] > 64 && (int)spell[0] < 91){
				ch = false;
				System.out.println(arr[i]);
			}
			return ch;
	}


	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of words: ");
		int num = scanner.nextInt();
		scanner.nextLine();
		String[] arr = new String[num];
		for(int i = 0; i < num; i++){
			System.out.print("The word number " + (i + 1) + ": ");
			arr[i] = scanner.nextLine();
		}
		System.out.println("\nWords that start with capital letter: ");
		boolean check = true;
		for(int i = 0; i < num; i++){
			char[] spell = arr[i].toCharArray();
			check = capitalLetter(spell, arr, i, check);
		}
		if(check){
			System.out.println("Any words with capital letter...");
		}
	}
}
