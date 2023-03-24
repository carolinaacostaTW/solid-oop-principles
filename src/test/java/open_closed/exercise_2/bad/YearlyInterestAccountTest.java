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
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1276.2815625000003,  result);
        assertEquals(1276.2815625000003,  account.getBalance());
    }
}