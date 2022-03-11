import java.util.Scanner;

public class Course implements Comparable<Course> {
    private String code;
    private String name;

    public Course(String courseCode, String courseName) {
        code = courseCode;
        name = courseName;
    }

}
