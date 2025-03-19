package practice.Savings;

public class Demo {
    public static void main(String[] args) {
        Methods method = new Methods();
        SavingsAccount saver1 = new SavingsAccount(1000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        Methods.modifyInterestRate(3.00);

        method.calculateMonthlyInterest(saver1);
        method.calculateMonthlyInterest(saver2);

        Methods.modifyInterestRate(4.00);

        method.calculateMonthlyInterest(saver1);
        method.calculateMonthlyInterest(saver2);

    }
}
