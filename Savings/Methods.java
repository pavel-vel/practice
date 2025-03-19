package practice.Savings;

public class Methods {
    public void calculateMonthlyInterest (SavingsAccount balance){
        double interest = balance.getSavingsBalance() * SavingsAccount.getAnnualInterestRate() / 12;
        balance.setSavingsBalance(balance.getSavingsBalance() + interest);
        System.out.println("The current balance is: $" + balance.getSavingsBalance());
    }

    public static void modifyInterestRate (double newRate) {
        SavingsAccount.setAnnualInterestRate(newRate);
    }
}
