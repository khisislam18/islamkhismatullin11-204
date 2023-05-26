import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    Integer id;
    String name;
    String email;
    String country;

    List<Integer> follows;
    List<User> followsUser;
}
