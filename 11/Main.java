import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<String> fileLineParseToArray(String file, String line) throws IOException {
        List<String> list = new ArrayList<>();
        char [] charArrayCurrentLine = line.toCharArray();
        String partOfLine = "";
        int innerIndex = 0;
        for (char c: charArrayCurrentLine) {
            if(c != 44){
                partOfLine += c;
            }
            if(c == 44 || innerIndex == charArrayCurrentLine.length - 1){
                list.add(partOfLine);
                partOfLine = "";
            }
            innerIndex += 1;
        }
        return new ArrayList<>(list);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Student> students = new ArrayList<>();
        String fileStudent = "C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\11\\students.txt";
        String fileCourses = "C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\11\\courses.txt";
        String fileCoursesStudents = "C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\11\\courses_students.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileStudent))) {
            while (true) {
                String studentLineParse = bufferedReader.readLine();
                if(studentLineParse == null){
                    break;
                }
                List<String> studentLine = fileLineParseToArray(fileStudent, studentLineParse);
                List<Student.Course> courseList = new ArrayList<>();
                try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader((fileCoursesStudents)))) {
                    while (true) {
                        String studentCourseLineParse = bufferedReader1.readLine();
                        if(studentCourseLineParse == null){
                            break;
                        }
                        List<String> coursesStudentLine = fileLineParseToArray(fileStudent, studentCourseLineParse);
                        if (coursesStudentLine.get(1).equals(studentLine.get(0))) {
                            try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileCourses))) {
                                while (true) {
                                    String courseLineParse = bufferedReader2.readLine();
                                    if(courseLineParse == null){
                                        break;
                                    }
                                    List<String> courseLine = fileLineParseToArray(fileCourses, courseLineParse);
                                    if (coursesStudentLine.get(0).equals(courseLine.get(0))) {
                                        courseList.add(new Student.Course(courseLine.get(0), courseLine.get(1)));
                                    }
                                }
                            }
                        }
                    }
                }
                students.add(new Student(studentLine.get(0), Integer.parseInt(studentLine.get(1)), Integer.parseInt(studentLine.get(2)), studentLine.get(3), Integer.parseInt((studentLine.get(4))), courseList));
            }
            for (Student s: students) {
                System.out.println(s);
            }
        }catch(FileNotFoundException e){
            System.out.println("No such a file in the directory.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
