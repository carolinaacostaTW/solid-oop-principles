package open_closed.exercise_2.bad;

public class PremiumAccount extends Account{

    private static final double TRANSFER_FEE = 2;
    private static final double MONTHLY_INTEREST = 2;
    private static final double YEARLY_INTEREST = 3;

    public PremiumAccount(double balance) {
        super(balance, TRANSFER_FEE, MONTHLY_INTEREST);
    }

    @Override
    public double applyInterest(int numberOfYears) {
        double compoundInterest = java.lang.Math.pow((1 + YEARLY_INTEREST), numberOfYears);
        balance = balance * compoundInterest;
        return balance;
    }
}
