package practice.Employee;

public class Methods {

    public double calculateYearlySalary(Employee employee) {
        return Math.round(employee.getMonthlySalary() * 12);
    }

    public void increaseMonthlySalary(double percentage, Employee employee) {

        if (percentage > 0) {
            employee.setMonthlySalary(employee.getMonthlySalary() * (1 + percentage / 100));
        }
    }

    public void printEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + "'s yearly salary is: " + calculateYearlySalary(employee) + " BGN.");
    }

    public void printEmployeeInc(Employee employee) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + "'s increased yearly salary is: " + calculateYearlySalary(employee) + " BGN.");
    }
}
