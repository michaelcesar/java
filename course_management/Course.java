package course_management;

public class Course {
    private int id;
    private String name;
    private int timeDuration;

    public Course(int id, String name, int timeDuration) {
        this.id = id;
        this.name = name;
        this.timeDuration = timeDuration;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    @Override
    public String toString() {
        return "Curso | ID: " + id + ", Nome: " + name + ", Tempo de duração: " + timeDuration + "|";
    }
}
