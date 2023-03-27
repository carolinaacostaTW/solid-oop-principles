package open_closed.exercise_2.bad;

import java.util.UUID;

public abstract class Account {

    protected final UUID accountId;
    protected double balance;
    protected final double withdrawFees;
    protected final double transferFees;

    public Account(final double balance,
                   final double withdrawFees,
                   final double transferFees) {
        this.accountId = UUID.randomUUID();
        this.balance = balance;
        this.withdrawFees = withdrawFees;
        this.transferFees = transferFees;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public final double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + withdrawFees;
        balance -= amountAfterFees;
        return balance;
    }

    public double transfer(double amount, Account toAccount){
        double amountAfterFees = amount + transferFees;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

}
