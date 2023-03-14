package open_closed.exercise_1.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    private class MyShape extends Shape {

        @Override
        public double calculateArea() {
            return 314.51;
        }
    }

    @Test
    void calculateAre_whenInputIsMyShape(){
        final var myShape = new MyShape();

        assertEquals(314.51, AreaCalculator.calculateArea(myShape));
    }
}