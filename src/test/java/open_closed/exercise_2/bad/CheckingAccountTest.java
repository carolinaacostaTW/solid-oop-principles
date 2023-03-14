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
    void deposit() {

        final var result = account.deposit(500);

        assertEquals(1500,  result);
        assertEquals(1500,  account.getBalance());
    }

}