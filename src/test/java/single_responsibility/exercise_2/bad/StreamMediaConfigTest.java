package single_responsibility.exercise_2.bad;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StreamMediaConfigTest {

    private static final String TITLE = "Title";

    private static class ClassUnderTest extends StreamMediaConfig {
        public ClassUnderTest(final String title, final int duration) {
            super(title, duration);
        }
    }

    private static Stream<Arguments> durationAndResults() {
        return Stream.of(
                arguments(60, "01:00"),
                arguments(120, "02:00"),
                arguments(0, "00:00"),
                arguments(92, "01:32"),
                arguments(90, "01:30")
        );
    }

    @ParameterizedTest
    @MethodSource("durationAndResults")
    public void getPrettyDuration_shouldReturnDurationFormatted(final int duration,
                                                                final String prettyDuration){

        final var stream = new ClassUnderTest(TITLE, duration);

        assertEquals(prettyDuration, stream.getPrettyDuration());
    }
}