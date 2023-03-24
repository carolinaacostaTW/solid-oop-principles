package open_closed.exercise_2.bad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    private CheckingAccount account;

    @BeforeEach
    public void setUp(){
        account = new CheckingAccount(1000);
    }

    @Test
    void applyInterest() {
        final var result = account.applyInterest(5);

        assertEquals(1000,  result);
        assertEquals(1000,  account.getBalance());
    }
}