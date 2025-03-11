package practice.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee aleksi = new Employee("Alexi", "Sokachev", -5000);
        Employee peter = new Employee("Peter", "Herakov", 100);

       aleksi.printEmployeeNor();
       peter.printEmployeeNor();

        aleksi.increaseMonthlySalary();
        peter.increaseMonthlySalary();

        System.out.println("\nAfter a 10% increase their new salaries are: ");
        aleksi.printEmployeeInc();
        peter.printEmployeeInc();
    }
}
