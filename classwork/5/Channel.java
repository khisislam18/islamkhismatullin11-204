public class Channel {
    Integer id;
    String name;
    Double subs;
    String country;

    public Channel(Integer id, String name, Double subs, String country) {
        this.id = id;
        this.name = name;
        this.subs = subs;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subs=" + subs +
                ", country='" + country + '\'' +
                '}';
    }
}
