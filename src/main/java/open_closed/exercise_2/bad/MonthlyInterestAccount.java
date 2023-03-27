package open_closed.exercise_2.bad;

public class MonthlyInterestAccount extends Account {

    private static final double WITHDRAW_FEE = 1;
    private static final double TRANSFER_FEE = 2;
    private static final double MONTHLY_INTEREST = 0.01;

    public MonthlyInterestAccount(double balance) {
        super(balance, WITHDRAW_FEE, TRANSFER_FEE);
    }

    @Override
    public double withdraw(double amount) {
        balance -= amount - WITHDRAW_FEE;
        return balance;
    }

    @Override
    public double applyInterest(int numberOfMonths) {
        double compoundInterest = java.lang.Math.pow((1 + MONTHLY_INTEREST), numberOfMonths);
        balance = balance * compoundInterest;
        return balance;
    }
}
