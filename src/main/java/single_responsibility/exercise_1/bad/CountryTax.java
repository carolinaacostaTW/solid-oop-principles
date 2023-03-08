package single_responsibility.exercise_1.bad;

public enum CountryTax {
    SPAIN(0.21),
    GERMANY(0.19),
    UK(0.2),
    FRANCE(0.2);

    final double tax;

    CountryTax(double tax) {
        this.tax = tax;
    }
}
