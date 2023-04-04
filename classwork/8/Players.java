import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Players {
    int id;
    String first_name;
    String last_name;
    String position;
    int id_team;
    String abbreviation;
    String city;
    String conference;
    String division;
    String full_name;
    String name;
}
