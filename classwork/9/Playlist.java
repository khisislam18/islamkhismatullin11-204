import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Playlist{
    String track_name;
    String track_add_date;
    String track_add_time;
    boolean multiple_artists_bool; //3
    String name_of_artists;
    String album_name;
    String album_release_date;
    String album_release_date_precision;
    Integer number_of_tracks_in_album; //8
    Integer position_in_playlist; //9
    Long track_duration_ms; //10
    Integer track_popularity; //11
    boolean track_explicit; //12
    String images_path;
    String data_collection_date;
}
