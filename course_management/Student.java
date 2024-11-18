package course_management;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Course> enrolledCourse;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourse = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public List<Course> getenrolledCourse() {
        return enrolledCourse;
    }

    public void enrollCourse(Course course) {
        enrolledCourse.add(course);
    }

    public void unenrollCourse(Course course) {
        enrolledCourse.remove(course);
    }

    @Override
    public String toString() {
        return "Aluno | ID: " + id + ", Nome: " + name + ", Cursos matriculados: " + enrolledCourse + "|";
    }
}
