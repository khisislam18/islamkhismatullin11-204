import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("nba_players.csv");
/*        FileOutputStream fileOutputStream = new FileOutputStream("nba_players.csv");
        fileOutputStream.close();*/
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        System.out.println(bytes);
        String str = new String(bytes);
        String [] strArray = str.split("\\r?\\n");
        List<Players> playersList = new ArrayList<>();
        for (int i = 1; i < strArray.length; i++) {
            String [] strArrayInner = strArray[i].split(",");
            playersList.add(new Players(Integer.parseInt(strArrayInner[0]), strArrayInner[1],strArrayInner[2],strArrayInner[3],Integer.parseInt(strArrayInner[4]), strArrayInner[5],strArrayInner[6],strArrayInner[7],strArrayInner[8],strArrayInner[9],strArrayInner[10]));
        }
        /*System.out.println(playersList);*/
        Map<String,List<Players>> map = playersList.stream().collect(Collectors.groupingBy(x->x.city));
        System.out.println(map);
        List<Players> list = new ArrayList<>();
        map.entrySet().stream().filter(x->x.getKey().equals("New York")).map(x->x.getValue());
    }
}
