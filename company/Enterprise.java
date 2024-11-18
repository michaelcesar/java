package company;

import java.util.ArrayList;
import java.util.List;

public class Enterprise<T extends Employee> {
    private List<T> Employees;

    public Enterprise() {
        this.Employees = new ArrayList<>();
    }

    public void addEmployee(T Employee) {
        Employees.add(Employee);
    }

    public void removeEmployee(T Employee) {
        Employees.remove(Employee);
    }

    public void listEmployees() {
        System.out.println("Lista de funcionários e seus salários:");
        for (T Employee : Employees) {
            System.out.println(Employee.getname() + " | Salário: R$ " + Employee.calcSalary());
        }
    }
}
