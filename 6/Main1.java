import java.util.Arrays;
import java.util.Scanner;


public class Main1 {
    public static int[] bubbleSort(int[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            counter++;
            for(int j = 1; j < arr.length; j++){
                if(arr[j - 1] > arr[j]){
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                counter++;
            }
        }
        System.out.println("Amount of iterations in bubble sort: " + counter);
        return arr;
    }
    public static int[] optimizedBubbleSort(int[] arr){
        int counter = 0;
        for(int i = 1; i < arr.length; i++){
            counter++;
            for(int j = i; j < arr.length; j++){
                if(arr[j - 1] > arr[j]){
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                counter++;
            }
        }
        System.out.println("Amount of iterations in optimized bubble sort: " + counter);
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int [] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Current array:\n" + Arrays.toString(arr));
        System.out.println("Bubble sort of array:\n" + Arrays.toString(bubbleSort(arr)));
        System.out.println("Optimized bubble sort of array:\n" + Arrays.toString(optimizedBubbleSort(arr)));
    }
}
