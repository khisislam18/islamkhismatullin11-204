import java.util.Scanner;

public class Main3 {
    public static int[] optimizedBubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
        int [] sortArr = optimizedBubbleSort(arr);
        String [] amountArr = new String[k];
        for (int i = 0; arr[i] != arr[i+1]; i++) {
            
        }
    }
}

