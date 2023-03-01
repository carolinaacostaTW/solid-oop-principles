package single_responsibility.exercise_1.bad;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateTax(Country country) {
        return this.price * country.tax;
    }

    public double calculateTaxForOrder(int quantity, Country country) {
        return quantity * calculateTax(country);
    }
}