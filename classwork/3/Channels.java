public class Channels {
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
