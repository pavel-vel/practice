package practice.Employee;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return (int) Math.round(monthlySalary * 12);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            this.monthlySalary = 0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }
    public void increaseMonthlySalary () {

        setMonthlySalary(this.monthlySalary * 1.1);
    }

    public void printEmployeeNor () {
        System.out.println(getFirstName() + " " + getLastName() + "'s yearly salary is: " + getMonthlySalary() * 12 + " BGN.");
    }
    public void printEmployeeInc () {
        System.out.println(getFirstName() + " " + getLastName() + "'s increased yearly salary is: " + getYearlySalary() + " BGN.");
    }
}


