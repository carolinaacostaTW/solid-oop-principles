package open_closed.exercise_2.bad;

public class TransferWithFeesAccount extends Account {
    private static final double TRANSFER_FEE = 5;

    public TransferWithFeesAccount(double balance) {
        super(balance, 0.0, TRANSFER_FEE);
    }
}
