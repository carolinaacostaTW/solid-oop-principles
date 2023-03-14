package open_closed.exercise_1.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void calculateArea_whenShapeIsTriangle(){
        var triangle = new Triangle(90, 90, 90);

        assertEquals(3507.4028853269765, triangle.calculateArea());
    }
}