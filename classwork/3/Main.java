import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
    public static class Channels {
        private String channelId;
        private String customUrl;
        private String title;
        private String country;
        private Long viewCount;
        private Long subscriberCount;
        private Long videoCount;
        private Boolean madeForkids;
        private String creationDate;

        public Channels(String channelId, String customUrl, String title, String country, Long viewCount, Long subscriberCount, Long videoCount, Boolean madeForkids, String creationDate) {
            this.channelId = channelId;
            this.customUrl = customUrl;
            this.title = title;
            this.country = country;
            this.viewCount = viewCount;
            this.subscriberCount = subscriberCount;
            this.videoCount = videoCount;
            this.madeForkids = madeForkids;
            this.creationDate = creationDate;
        }

        public String getChannelId() {
            return channelId;
        }

        public String getCustomUrl() {
            return customUrl;
        }

        public String getTitle() {
            return title;
        }

        public String getCountry() {
            return country;
        }

        public Long getViewCount() {
            return viewCount;
        }

        public Long getSubscriberCount() {
            return subscriberCount;
        }

        public Long getVideoCount() {
            return videoCount;
        }

        public Boolean getMadeForkids() {
            return madeForkids;
        }

        public String getCreationDate() {
            return creationDate;
        }

        @Override
        public String toString() {
            return "Channels{" +
                    "channelId='" + channelId + '\'' +
                    ", customUrl='" + customUrl + '\'' +
                    ", title='" + title + '\'' +
                    ", country='" + country + '\'' +
                    ", viewCount=" + viewCount +
                    ", subscriberCount=" + subscriberCount +
                    ", videoCount=" + videoCount +
                    ", madeForkids=" + madeForkids +
                    ", creationDate='" + creationDate + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("output (2).csv"));
        HashSet<Channels> set = new HashSet<>();
        scanner.nextLine();
        scanner.nextLine();
        while(scanner.hasNext()){
            String currentLine = scanner.nextLine();
            String [] array = currentLine.split(";");
            set.add(new Channels(array[0], array[1], array[2], array[3], Long.parseLong(array[4]), Long.parseLong(array[5]), Long.parseLong(array[6]), !array[7].equals("False"), array[8]));
            scanner.nextLine();
        }
        //кол-во каналов из us
        Iterator<Channels> iterator = set.iterator();
        int counter = 0;
        while(iterator.hasNext()){
            Channels current = iterator.next();
            if(current.getCountry().equals("US")){
                counter++;
            }
        }
        System.out.println(counter);

        //топ 5 каналов по видео
        TreeSet<Channels> treeSet = new TreeSet<>((x,y) -> (y.getVideoCount().compareTo(x.getVideoCount())));
        treeSet.addAll(set);
        Iterator<Channels> iterator1 = treeSet.iterator();
        counter = 0;
        System.out.println("videoCount");
        while(iterator1.hasNext() && counter < 5){
            System.out.println(iterator1.next());
            counter++;
        }
        //топ 5 по подписчиков
        TreeSet<Channels> treeSet1 = new TreeSet<>((x,y) -> (y.getSubscriberCount().compareTo(x.getSubscriberCount())));
        treeSet1.addAll(set);
        Iterator<Channels> iterator2 = treeSet1.iterator();
        counter = 0;
        System.out.println("subCount");
        while(iterator2.hasNext() && counter < 5){
            System.out.println(iterator2.next());
            counter++;
        }
        //топ 5 общее число просмотров
        TreeSet<Channels> treeSet2 = new TreeSet<>((x,y) -> (y.getViewCount().compareTo(x.getViewCount())));
        treeSet2.addAll(set);
        Iterator<Channels> iterator3 = treeSet2.iterator();
        counter = 0;
        System.out.println("viewCount");
        while(iterator3.hasNext() && counter < 5){
            System.out.println(iterator3.next());
            counter++;
        }

    }
}
