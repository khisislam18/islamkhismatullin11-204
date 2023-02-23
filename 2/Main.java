import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static class Ranking implements Comparable{
        private String country;
        private String region;
        private int edition;
        private int prRating;
        private int clRating;

        public Ranking(String country, String region, int edition, int prRating, int clRating) {
            this.country = country;
            this.region = region;
            this.edition = edition;
            this.prRating = prRating;
            this.clRating = clRating;
        }

        public Ranking() {

        }

        public String getCountry() {
            return country;
        }

        public String getRegion() {
            return region;
        }

        public int getEdition() {
            return edition;
        }

        public int getPrRating() {
            return prRating;
        }

        public int getClRating() {
            return clRating;
        }

        @Override
        public String toString() {
            return "Ranking{" +
                    "country='" + country + '\'' +
                    ", region='" + region + '\'' +
                    ", edition=" + edition +
                    ", prRating=" + prRating +
                    ", clRating=" + clRating +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
    public static class ExtendedRanking extends Ranking implements Comparable{
        private int b1;
        private int b2;
        private int b;

        public ExtendedRanking(String country, String region, int edition, int prRating, int clRating, int b1, int b2, int b) {
            super(country, region, edition, prRating, clRating);
            this.b1 = b1;
            this.b2 = b2;
            this.b = b;
        }
        public ExtendedRanking(){}

        public int getB1() {
            return b1;
        }

        public void setB1(int b1) {
            this.b1 = b1;
        }

        public int getB2() {
            return b2;
        }

        public void setB2(int b2) {
            this.b2 = b2;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return "ExtendedRanking{" +
                    "b1=" + b1 +
                    ", b2=" + b2 +
                    ", b=" + b +
                    '}';
        }
    }
    // Метод, который сортирует список,
    // типизированный наследником Ranking,
    // по полю PR rating и выводит первую встретившуюся страну,
    // PR rating которой равен 5, а после выводит ее индекс в списке
    public static int configuredSort(Comparator<? super Ranking> comparator, List<? extends Ranking> list){
        list.sort(comparator);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrRating() == 5){
                return i;
            }
        }
        return -1;
    }
    //Метод, который принимает список, типизированный родителем ExtendedRanking,
    // и Nное значение количества.
    // Метод должен добавить в пришедший список N новых экземпляров ExtendedRanking
    public static void addSome(List<? super ExtendedRanking> list, int n){
        for (int i = 0; i < n; i++) {
            list.add(new ExtendedRanking());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "ranking.csv";
        Scanner scanner = new Scanner(new File(path));
        List<Ranking> rankingList = new ArrayList<>();
        List<ExtendedRanking> extendedRankings = new ArrayList<>();
        String nextLine = scanner.nextLine();
        while(scanner.hasNext()){
            nextLine = scanner.nextLine();
            String[] data = nextLine.split(",");
            rankingList.add(new Ranking(data[0], data[1], Integer.parseInt(data[3]), Integer.parseInt(data[5]), Integer.parseInt(data[6])));
            extendedRankings.add(new ExtendedRanking(data[0], data[1], Integer.parseInt(data[3]), Integer.parseInt(data[5]), Integer.parseInt(data[6]),Integer.parseInt(data[11]), Integer.parseInt(data[12]), Integer.parseInt(data[15])));
        }
        //Компораторы
        Comparator<Ranking> rankingComparator = new Comparator<Ranking>() {
            @Override
            public int compare(Ranking o1, Ranking o2) {
                return Integer.compare(o1.prRating, o2.prRating);
            }
        };
        Comparator<ExtendedRanking> extendedRankingComparator = new Comparator<ExtendedRanking>() {
            @Override
            public int compare(ExtendedRanking o1, ExtendedRanking o2) {
                return Integer.compare(o1.b, o2.b);
            }
        };
        Comparator<Ranking> rankingComparatorString = new Comparator<Ranking>() {
            @Override
            public int compare(Ranking o1, Ranking o2) {
                return o1.country.compareTo(o2.country);
            }
        };
        //1
        int num = Main.configuredSort(rankingComparator, rankingList);
        int num2 = Main.configuredSort(rankingComparator, extendedRankings);
        System.out.println(num);
        System.out.println(num2);
        //2
        extendedRankings.sort(extendedRankingComparator);
        for (int i = 0; i < 5; i++) {
            System.out.println(rankingList.get(i));
        }
        //3
        Main.addSome(extendedRankings, 3);
        //4
        for (int i = extendedRankings.size() - 5; i < extendedRankings.size(); i++) {
            System.out.println(extendedRankings.get(i));
        }
        //5
        rankingList.sort(rankingComparatorString);
        for (int i = 0; i < 5; i++) {
            System.out.println(rankingList.get(i));
        }
    }
}
