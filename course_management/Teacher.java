package course_management;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Course> coursesTaught;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesTaught = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public List<Course> getcoursesTaught() {
        return coursesTaught;
    }

    public void addCourse(Course course) {
        coursesTaught.add(course);
    }

    public void removeCourse(Course course) {
        coursesTaught.remove(course);
    }

    @Override
    public String toString() {
        return "Professor | ID: " + id + ", Nome: " + name + ", Cursos ministrados: " + coursesTaught + "|";
    }
}