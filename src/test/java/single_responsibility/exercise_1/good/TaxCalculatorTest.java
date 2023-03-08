package single_responsibility.exercise_1.good;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import single_responsibility.exercise_1.bad.CountryTax;
import single_responsibility.exercise_1.bad.Product;
import single_responsibility.exercise_1.bad.TaxCalculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TaxCalculatorTest {

    private static Stream<Arguments> productAndTaxes() {
        return Stream.of(
                arguments(CountryTax.SPAIN, 0.6594, 2, 1.3188),
                arguments(CountryTax.GERMANY, 0.5966, 2, 1.1932),
                arguments(CountryTax.UK, 0.6280000000000001, 2, 1.2560000000000002),
                arguments(CountryTax.FRANCE, 0.6280000000000001, 2, 1.2560000000000002)
        );
    }

    @ParameterizedTest
    @MethodSource("productAndTaxes")
    void productWithCountryVat_calculateThePriceCorrectly(final CountryTax countryTax,
                                                          final double expectedTax,
                                                          final int quantity,
                                                          final double expectedTaxForOrder){
        Product myProduct = new Product("myProduct", 3.14);
        TaxCalculator taxCalculator = new TaxCalculator();

        assertEquals(expectedTax, taxCalculator.calculateTax(countryTax, myProduct));
        assertEquals(expectedTaxForOrder, taxCalculator.calculateTaxForOrder(quantity, countryTax, myProduct));
    }
}