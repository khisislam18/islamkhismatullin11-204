package Task234;

import Task1.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task3 {
    public static void listTop5(ModifiableCollection<? extends Billionare> collection, Comparator<Billionare> comparator){
        ModifiableCollection<Billionare> tmp = new ModifiableCollection<>(Billionare.class, new ArrayList<>());
        tmp.addAll(collection);
        tmp.sort(comparator);
        Iterator<Billionare> iterator = tmp.iterator();
        String maxOrg = "";
        int maxCountOrg = 0;
        int countOrg = 0;
        String currentOrganization = iterator.next().organization;
        while(iterator.hasNext()){
            String streamedOrg = iterator.next().organization;
            if(currentOrganization.equals(streamedOrg)){
                countOrg++;
            }else{
                if(maxCountOrg < countOrg){
                    maxCountOrg = countOrg;
                    maxOrg = streamedOrg;
                }
                countOrg = 0;
            }
        }
        for (Billionare streamedOrg : tmp) {
            if (streamedOrg.organization.equals(maxOrg)) {
                System.out.println(streamedOrg);
                for (int i = 0; i < 4; i++) {
                    System.out.println(iterator.next());
                }
                break;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\3\\Task234\\neww.csv"));
        ModifiableCollection<Billionare> collection = new ModifiableCollection<>(Billionare.class, new ArrayList<>());
        sc.nextLine();
        Iterator<Billionare> iterator = collection.iterator();
        while(sc.hasNext()){
            String [] currentLine = sc.nextLine().split(";");
            collection.add(new Billionare(Integer.parseInt(currentLine[0]),
                    currentLine[1] == null ? "null": currentLine[1],
                    currentLine[2] == null ? Integer.parseInt(currentLine[2]) : 0,
                    currentLine[3] == null ? Integer.parseInt(currentLine[3]) : 0,
                    currentLine[4] == null ? "null": currentLine[4],
                    currentLine[5] == null ? "null": currentLine[5],
                    currentLine[6] == null ? "null": currentLine[6],
                    currentLine[7] == null ? "null": currentLine[7],
                    currentLine[8] == null ? "null": currentLine[8],
                    currentLine[9] == null ? "null": currentLine[9],
                    currentLine[10] == null ? "null": currentLine[10],
                    currentLine[11] == null ? "null": currentLine[11],
                    currentLine[12] == null ? "null": currentLine[12],
                    currentLine[13] == null ? "null": currentLine[13],
                    currentLine[14] == null ? "null": currentLine[14]));
        }
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Comparator<Billionare> comparator = (o1, o2) -> o1.organization.compareTo(o2.organization);
        listTop5(collection, comparator);
    }
}
