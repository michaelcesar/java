package company;

public abstract class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getbaseSalary() {
        return baseSalary;
    }

    public abstract double calcSalary();
}
