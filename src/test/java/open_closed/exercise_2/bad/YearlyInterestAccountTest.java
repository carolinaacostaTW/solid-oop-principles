package open_closed.exercise_2.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearlyInterestAccountTest {
    private YearlyInterestAccount account;

    @BeforeEach
    public void setUp(){
        account = new YearlyInterestAccount(1000);
    }

    @Test
    void deposit() {

        final var result = account.deposit(500);

        assertEquals(1500,  result);
        assertEquals(1500,  account.getBalance());
    }
    @Test
    void withdraw() {
        final var result = account.withdraw(500);

        assertEquals(498.5,  result);
        assertEquals(498.5,  account.getBalance());
    }

    @Test
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1276.2815625000003,  result);
        assertEquals(1276.2815625000003,  account.getBalance());
    }

    @Test
    void transferBasicAccount() {
        final var basicAccount = new BasicAccount(100);

        final var result = account.transfer(500, basicAccount);

        assertEquals(497.5,  result);
        assertEquals(497.5,  account.getBalance());
    }

    @Test
    void transfer() {
        final var checkingAccount = new CheckingAccount(100);

        final var result = account.transfer(500, checkingAccount);

        assertEquals(497.5,  result);
        assertEquals(497.5,  account.getBalance());
    }

    @Test
    void testTransfer() {
        final var monthlyInterestAccount = new MonthlyInterestAccount(100);

        final var result = account.transfer(700, monthlyInterestAccount);

        assertEquals(297.5,  result);
        assertEquals(297.5,  account.getBalance());
    }

    @Test
    void transferYearlyInterestAccount() {
        final var yearlyInterestAccount = new YearlyInterestAccount(200);

        final var result = account.transfer(600, yearlyInterestAccount);

        assertEquals(397.5,  result);
        assertEquals(397.5,  account.getBalance());
    }

}