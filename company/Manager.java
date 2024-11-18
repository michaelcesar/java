package company;

public class Manager extends Employee implements Bonus {

    public Manager(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calcSalary() {
        double bonus = calcBonus(10);
        return getbaseSalary() + bonus;
    }

    @Override
    public double calcBonus(double percentage) {
        return getbaseSalary() * (percentage / 100);
    }
}
