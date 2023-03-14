package open_closed.exercise_1.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void calculateArea_whenShapeIsCircle(){
        var circle = new Circle(90);

        assertEquals(25446.900494077323, circle.calculateArea());
    }
}