package open_closed.exercise_2.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyInterestAccountTest {
    private MonthlyInterestAccount account;

    @BeforeEach
    public void setUp(){
        account = new MonthlyInterestAccount(1000);
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

        assertEquals(501.0,  result);
        assertEquals(501.0,  account.getBalance());
    }

    @Test
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1051.0100501000002,  result);
        assertEquals(1051.0100501000002,  account.getBalance());
    }

    @Test
    void transferBasicAccount() {
        final var basicAccount = new BasicAccount(100);

        final var result = account.transfer(500, basicAccount);

        assertEquals(498.0,  result);
        assertEquals(498.0,  account.getBalance());
    }

    @Test
    void transfer() {
        final var checkingAccount = new CheckingAccount(100);

        final var result = account.transfer(500, checkingAccount);

        assertEquals(498.0,  result);
        assertEquals(498.0,  account.getBalance());
    }

    @Test
    void testTransfer() {
        final var monthlyInterestAccount = new MonthlyInterestAccount(100);

        final var result = account.transfer(700, monthlyInterestAccount);

        assertEquals(298.0,  result);
        assertEquals(298.0,  account.getBalance());
    }

    @Test
    void transferYearlyInterestAccount() {
        final var yearlyInterestAccount = new YearlyInterestAccount(200);

        final var result = account.transfer(600, yearlyInterestAccount);

        assertEquals(398.0,  result);
        assertEquals(398.0,  account.getBalance());
    }
}