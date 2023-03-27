package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private class AccountUnderTest extends Account {

        public AccountUnderTest(double balance) {
            super(balance, 0.1, 0.2);
        }
    }

    @Test
    void whenAnAccountIsCreate_TheBalanceIsSetted(){
        AccountUnderTest account = new AccountUnderTest(1000);

        assertEquals(1000, account.getBalance());
    }

    @Test
    void whenDeposit_TheBalanceIncrease(){
        AccountUnderTest account = new AccountUnderTest(1000);

        account.deposit(500);

        assertEquals(1500, account.getBalance());
    }

    @Test
    void whenWithdraw_TheBalanceDecrease(){
        AccountUnderTest account = new AccountUnderTest(1000);

        account.withdraw(500);

        assertEquals(499.9, account.getBalance());
    }

    @Test
    void whenTransferToAnotherAccount_TheBalanceDecrease(){
        AccountUnderTest account = new AccountUnderTest(1000);
        BasicAccount basicAccount = new BasicAccount(500);

        account.transfer(500, basicAccount);

        assertEquals(499.8, account.getBalance());
    }

    @Test
    void applyInterest() {
        AccountUnderTest account = new AccountUnderTest(1000);

        final var result = account.applyInterest(5);

        assertEquals(1000,  result);
        assertEquals(1000,  account.getBalance());
    }

}