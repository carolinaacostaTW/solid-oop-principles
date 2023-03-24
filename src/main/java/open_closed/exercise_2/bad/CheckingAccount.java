package open_closed.exercise_2.bad;

public class CheckingAccount extends Account{
    private static final double WITHDRAW_FEE = 0.15;

    public CheckingAccount(double balance) {
        super(balance, WITHDRAW_FEE, 0.0);
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }
}
