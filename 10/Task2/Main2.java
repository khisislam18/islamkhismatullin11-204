import java.io.*;
import java.util.Arrays;


public class Main2 {
    public static int getLineCountByIncrement(String filePath) throws IOException{
        int countLine = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            while(bufferedReader.readLine() != null){
                countLine += 1;
            }
        }
        return countLine;
    }


    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\10\\Task2\\cars.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(filePath));){
            int txtLength = getLineCountByIncrement(filePath);
            String [] arrTxtLines = new String [txtLength];
            for (int i = 0; i < txtLength; i++) {
                arrTxtLines[i] = bf.readLine();
            }
            Car [] cars = new Car [txtLength];
            for (int i = 0; i < txtLength; i++) {
                int speedFirst3Minutes = 0;
                int speedAfter = 0;
                int boostStartTime = 0;
                int countSpaces = 0;
                char [] charArr = arrTxtLines[i].toCharArray();
                String str = "";
                int index = 0;
                for (char c : charArr) {
                    if (c != 32) {
                        str += c;
                    }
                    if (c == 32 || index == charArr.length - 1) {
                        switch (countSpaces) {
                            case 0:
                                speedFirst3Minutes = Integer.parseInt(str);
                                break;
                            case 1:
                                speedAfter = Integer.parseInt(str);
                                break;
                            case 2:
                                boostStartTime = Integer.parseInt(str);
                                break;
                        }
                        countSpaces += 1;
                        str = "";
                    }
                    index++;
                }
                System.out.println(speedFirst3Minutes + ", " + speedAfter + ", " + boostStartTime);
                cars[i] = boostStartTime != 0 ? new BoostedCar(speedFirst3Minutes, speedAfter, boostStartTime) : new CasualCar(speedFirst3Minutes, speedAfter);
            }
            Race.start(cars, 10);

        }catch(FileNotFoundException e){
            System.out.println("No such a file or a directory.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
