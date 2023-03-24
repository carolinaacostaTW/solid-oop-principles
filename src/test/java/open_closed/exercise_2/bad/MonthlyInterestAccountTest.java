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
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1051.0100501000002,  result);
        assertEquals(1051.0100501000002,  account.getBalance());
    }
}