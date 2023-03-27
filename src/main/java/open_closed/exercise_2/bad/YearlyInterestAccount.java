package open_closed.exercise_2.bad;

public class YearlyInterestAccount extends Account {
    private static final double YEARLY_INTEREST = 0.05;
    private static final double WITHDRAW_FEE = 1.5;
    private static final double TRANSFER_FEE = 2.5;

    public YearlyInterestAccount(double balance) {
        super(balance, WITHDRAW_FEE, TRANSFER_FEE);
    }

    @Override
    public double applyInterest(int numberOfYears) {
        double compoundInterest = java.lang.Math.pow((1 + YEARLY_INTEREST), numberOfYears);
        balance = balance * compoundInterest;
        return balance;
    }
}
