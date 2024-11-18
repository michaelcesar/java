package course_management;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {

    public static void registerStudentCourse(Student student, Course course) {
        student.enrollCourse(course);
    }

    public static void registerTeacherCourse(Teacher teacher, Course course) {
        teacher.addCourse(course);
    }

    public static void viewCourseStudents(List<Student> students, Course course) {
        System.out.println("Estudantes matriculados no curso " + course.getname() + ": ");
        for (Student student : students) {
            if (student.getenrolledCourse().contains(course)) {
                System.out.println(student.getname());
            }
        }
    }

    public static void viewTeachersCourses(Teacher teacher) {
        System.out.println("Cursos ministrados pelo professor " + teacher.getname() + ": ");
        for (Course course : teacher.getcoursesTaught()) {
            System.out.println(course.getname());
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        Course course1 = new Course(1, "Gerencia de Projetos", 80);
        Course course2 = new Course(2, "Desenvolvimento de Sistemas Coorporativos", 80);
        courses.add(course1);
        courses.add(course2);

        Teacher teacher1 = new Teacher(1, "Francisco Sergio");
        Teacher teacher2 = new Teacher(2, "Jeferson Queiroga");
        teachers.add(teacher1);
        teachers.add(teacher2);

        Student student1 = new Student(1, "Michael");
        Student student2 = new Student(2, "César");
        students.add(student1);
        students.add(student2);

        registerTeacherCourse(teacher1, course1);
        registerTeacherCourse(teacher2, course2);

        registerStudentCourse(student1, course1);
        registerStudentCourse(student2, course2);
        registerStudentCourse(student2, course1);

        viewCourseStudents(students, course1);
        viewCourseStudents(students, course2);
        viewTeachersCourses(teacher1);
        viewTeachersCourses(teacher2);

    }
}
