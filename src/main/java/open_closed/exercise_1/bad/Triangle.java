package open_closed.exercise_1.bad;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calculateArea() {
        var semiperimeter = (a + b + c) / 2;
        return Math.sqrt(
                semiperimeter *
                        (semiperimeter - a) *
                        (semiperimeter - b) *
                        (semiperimeter - c));
    }
}
