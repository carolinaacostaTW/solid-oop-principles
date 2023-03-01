package single_responsibility.exercise_1.bad;

public enum Country {
    SPAIN(0.21),
    GERMANY(0.19),
    UK(0.2),
    FRANCE(0.2);

    final double tax;

    Country(double tax) {
        this.tax = tax;
    }
}
