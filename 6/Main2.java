import java.util.Scanner;

public class Main2 {
    public static int beginnerCheck(String [] arr){
        String [] matchedWord = new String[arr.length];
        int countMatchedWordGlobal = 0;
        for(int i = 0; i < arr.length; i++){
            boolean checkMatchedWordInner;
            int innerCounter = 0;
            char [] charArrI = arr[i].toCharArray();
            for(int j = 0; j < arr.length; j++){
                char [] charArrJ = arr[j].toCharArray();
                checkMatchedWordInner = true;
                if(i != j && charArrI.length <= charArrJ.length){
                        for(int k = 0; k < charArrI.length; k++){
                            if(charArrI[k] != charArrJ[k]){
                                checkMatchedWordInner = false;
                                break;
                            }
                    }
                    if(checkMatchedWordInner){
                        matchedWord[innerCounter] = arr[j];
                        innerCounter++;
                        countMatchedWordGlobal++;
                    }
                }
            }
            if(innerCounter > 0){
                System.out.print("String №" + (i + 1) + " (" + arr[i] + ") has " + innerCounter + " matches: " );
                for(int x = 0; x < innerCounter; x++){
                    if(x != innerCounter - 1){
                        System.out.print(matchedWord[x] + ", ");
                    }else{
                        System.out.println(matchedWord[x]);
                    }
                }
            }else{
                System.out.println("String №" + (i + 1) + " (" + arr[i] + ") has no matches");
            }
        }
        return countMatchedWordGlobal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String [] arr = new String[k];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextLine();
        }
        int globCount = beginnerCheck(arr);
        if(globCount > 0){
            System.out.println("There are " + globCount + " matches!");
        }else{
            System.out.println("There are no strings :(");
        }
    }
}
