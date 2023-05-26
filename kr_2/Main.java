import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("task.json")));
        String jsonString = bufferedReader.readLine();
        User[] person = mapper.readValue(jsonString, User[].class);
        System.out.println(person[0].follows);
        System.out.println(person[0].followsUser);
        for (User p:person) {
            for (Integer i:p.follows) {
                p.followsUser.add(Arrays.stream(person).filter(x->x.id.equals(i)).findFirst().orElse(null));
            }
        }
        System.out.println(person[0].follows);
        System.out.println(person[0].followsUser);
    }
}
