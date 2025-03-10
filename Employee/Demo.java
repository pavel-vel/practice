package practice.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee aleksi = new Employee("Alexi", "Sokachev", -5000);
        Employee peter = new Employee("Peter", "Herakov", 100);

        System.out.println(aleksi.getFirstName() + " " + aleksi.getLastName() + "'s yearly salary is: " + aleksi.getMonthlySalary() * 12 + " BGN.");
        System.out.println(peter.getFirstName() + " " + peter.getLastName() + "'s yearly salary is: " + peter.getMonthlySalary() * 12 + " BGN.");

        aleksi.setMonthlySalary(aleksi.getMonthlySalary() * 1.1);
        peter.setMonthlySalary(peter.getMonthlySalary() * 1.1);

        System.out.println("\nAfter a 10% increase their new salaries are: ");
        System.out.println(aleksi.getFirstName() + " " + aleksi.getLastName() + "'s increased yearly salary is: " + aleksi.getYearlySalary() + " BGN.");
        System.out.println(peter.getFirstName() + " " + peter.getLastName() + "'s increased yearly salary is: " + peter.getYearlySalary() + " BGN.");
    }
}
