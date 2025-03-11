package practice.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee aleksi = new Employee("Alexi", "Sokachev", -5000);
        Employee peter = new Employee("Peter", "Herakov", 100);

       aleksi.printEmployee();
       peter.printEmployee();

        aleksi.increaseMonthlySalary(10);
        peter.increaseMonthlySalary(100);

        System.out.println("\nAfter the increase their new salaries are: ");
        aleksi.printEmployee();
        peter.printEmployee();
    }
}
