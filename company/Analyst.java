package company;

public class Analyst extends Employee implements Bonus {

    public Analyst(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calcSalary() {
        double bonus = calcBonus(5);
        return getbaseSalary() + bonus;
    }

    @Override
    public double calcBonus(double percentage) {
        return getbaseSalary() * (percentage / 100);
    }
}
