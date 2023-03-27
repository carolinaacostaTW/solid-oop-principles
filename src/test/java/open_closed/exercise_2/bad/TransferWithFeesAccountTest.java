package open_closed.exercise_2.bad;

import org.junit.jupiter.api.BeforeEach;

class TransferWithFeesAccountTest {
    private TransferWithFeesAccount account;

    @BeforeEach
    public void setUp(){
        account = new TransferWithFeesAccount(1000);
    }

//    @Test
//    void applyInterest() {
//        final var result = account.applyInterest(5);
//
//        assertEquals(1000.0,  result);
//        assertEquals(1000.0,  account.getBalance());
//    }
}