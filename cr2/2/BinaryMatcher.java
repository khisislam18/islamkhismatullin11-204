import java.util.Scanner;
import java.util.regex.Pattern;

public class BinaryMatcher {
    public static void binaryStringCheck(String[] binArray){
        for (int i = 0; i < binArray.length; i++) {
            Pattern pattern = Pattern.compile("0+|1+|(01)*0?|(10)*1?");
            if(pattern.matcher(binArray[i]).matches()){
                System.out.println(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[k];
        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextLine();
        }
        binaryStringCheck(array);
    }
}
