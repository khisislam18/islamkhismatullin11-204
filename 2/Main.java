import java.util.Scanner;

public class Main {
    public static class Ranking{
        String country;
        String region;
        int edition;
        int prRating;
        int clRating;

        public Ranking(String country, String region, int edition, int prRating, int clRating) {
            this.country = country;
            this.region = region;
            this.edition = edition;
            this.prRating = prRating;
            this.clRating = clRating;
        }
    }
    public static class ExtendedRanking extends Ranking{
        int b1;
        int b2;
        int b;

        public ExtendedRanking(String country, String region, int edition, int prRating, int clRating, int b1, int b2, int b) {
            super(country, region, edition, prRating, clRating);
            this.b1 = b1;
            this.b2 = b2;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        String path =
        Scanner scanner = new Scanner(new File())
    }
}
