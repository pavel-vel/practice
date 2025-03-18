package practice.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee aleksi = new Employee("Alexi", "Sokachev", -5000);
        Employee peter = new Employee("Peter", "Herakov", 1000);
        Methods method = new Methods();

        method.printEmployee(aleksi);
        method.printEmployee(peter);

        method.increaseMonthlySalary(10, aleksi);
        method.increaseMonthlySalary(100, peter);

        method.printEmployeeInc(aleksi);
        method.printEmployeeInc(peter);
    }
}
