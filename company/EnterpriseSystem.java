package company;

public class EnterpriseSystem {

    public static void main(String[] args) {

        Enterprise<Employee> Enterprise = new Enterprise<>();

        Employee Manager1 = new Manager("001", "Michael", 5000.00);
        Employee Analyst1 = new Analyst("002", "César", 3000.00);

        Enterprise.addEmployee(Manager1);
        Enterprise.addEmployee(Analyst1);

        Enterprise.listEmployees();

        Enterprise.removeEmployee(Analyst1);

        System.out.println("\nApós remover um funcionário:");
        Enterprise.listEmployees();
    }
}
