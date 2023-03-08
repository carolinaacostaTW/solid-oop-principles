package single_responsibility.exercise_1.bad;

public class TaxCalculator{

    public double calculateTax(CountryTax countryTax, Product product) {
        return product.getPrice() * countryTax.tax;
    }

    public double calculateTaxForOrder(int quantity, CountryTax countryTax, Product product) {
        return quantity * calculateTax(countryTax, product);
    }

}
