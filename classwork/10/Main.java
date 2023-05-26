import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("1111.csv");
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes, StandardCharsets.UTF_8);
        String[] strArr = str.split("\\r?\\n");
        List<Student> studentList = new ArrayList<>();
        for (int i = 2; i < strArr.length - 4; i += 2) {
            String[] innerStrArr = strArr[i].split(";");
            studentList.add(new Student(innerStrArr[0], innerStrArr[9].isEmpty() ? 0 : Double.parseDouble(innerStrArr[9].replace(",", ".")) , innerStrArr[20].isEmpty() ? 0 : Double.parseDouble(innerStrArr[20].replace(",", "."))));
        }
        Map<String, Double> studentKrMap = new TreeMap<>();
        for (Student student : studentList) {
            studentKrMap.put(student.fio, student.kr1 + student.kr2);
        }
        System.out.println(studentKrMap);
    }
}
