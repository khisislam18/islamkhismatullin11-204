import java.util.List;

public class Student {
    private String name;
    private int age;
    private int weight;
    private String groupNum;
    private int course;
    private List<Course> courses;

    public Student(String name, int age, int weight, String groupNum, int course, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.groupNum = groupNum;
        this.course = course;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public int getCourse() {
        return course;
    }

    public List<Course> getCourses() {
        return courses;
    }

    static class Course{
        private String name;
        private String description;

        public Course(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", groupNum='" + groupNum + '\'' +
                ", course=" + course +
                ", courses=" + courses +
                '}';
    }
}
