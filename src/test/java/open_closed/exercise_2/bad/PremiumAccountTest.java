package open_closed.exercise_2.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumAccountTest {

    private PremiumAccount account;

    @BeforeEach
    public void setUp(){
        account = new PremiumAccount(1000);
    }

    @Test
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1024000.0,  result);
        assertEquals(1024000.0,  account.getBalance());
    }

}