package single_responsibility.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamMediaConfigTest {

    private static final String TITLE = "Title";

    private static class ClassUnderTest extends StreamMediaConfig {

        public ClassUnderTest(String title, int duration) {
            super(title, duration);
        }
    }

//    @Test
//    public void getPrettyDuration_shouldReturnDurationFormatted(){
//
//        var stream = new ClassUnderTest(TITLE, 60);
//
//        assertEquals("00:01:00", stream.getPrettyDuration());
//    }
}