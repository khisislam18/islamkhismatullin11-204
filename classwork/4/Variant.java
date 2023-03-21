public class Variant {
    String date;
    String area;
    String area_type;
    String variant_name;
    Integer specimens;
    String percentage;
    String specimens_7d_avg;
    String percentage_7d_avg;

    public Variant(String date, String area, String area_type, String variant_name, Integer specimens, String percentage, String specimens_7d_avg, String percentage_7d_avg) {
        this.date = date;
        this.area = area;
        this.area_type = area_type;
        this.variant_name = variant_name;
        this.specimens = specimens;
        this.percentage = percentage;
        this.specimens_7d_avg = specimens_7d_avg;
        this.percentage_7d_avg = percentage_7d_avg;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "date='" + date + '\'' +
                ", area='" + area + '\'' +
                ", area_type='" + area_type + '\'' +
                ", variant_name='" + variant_name + '\'' +
                ", specimens='" + specimens + '\'' +
                ", percentage='" + percentage + '\'' +
                ", specimens_7d_avg='" + specimens_7d_avg + '\'' +
                ", percentage_7d_avg='" + percentage_7d_avg + '\'' +
                '}';
    }
}
