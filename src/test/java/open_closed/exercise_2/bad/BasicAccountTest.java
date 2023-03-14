package open_closed.exercise_2.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccountTest {

    private BasicAccount account;

    @BeforeEach
    public void setUp(){
        account = new BasicAccount(1000);
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

        assertEquals(499.9,  result);
        assertEquals(499.9,  account.getBalance());
    }

    @Test
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1000,  result);
        assertEquals(1000,  account.getBalance());
    }

    @Test
    void transfer() {
        final var checkingAccount = new CheckingAccount(100);

        final var result = account.transfer(500, checkingAccount);

        assertEquals(498.5,  result);
        assertEquals(498.5,  account.getBalance());
    }

    @Test
    void testTransfer() {
        final var monthlyInterestAccount = new MonthlyInterestAccount(100);

        final var result = account.transfer(700, monthlyInterestAccount);

        assertEquals(298.5,  result);
        assertEquals(298.5,  account.getBalance());
    }

    @Test
    void testTransfer1() {
        final var yearlyInterestAccount = new YearlyInterestAccount(200);

        final var result = account.transfer(600, yearlyInterestAccount);

        assertEquals(398.5,  result);
        assertEquals(398.5,  account.getBalance());
    }
}