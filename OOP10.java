// Student.java
import java.util.ArrayList;
import java.util.List;

 class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}
