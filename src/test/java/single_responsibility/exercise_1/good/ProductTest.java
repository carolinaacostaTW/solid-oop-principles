package single_responsibility.exercise_1.good;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import single_responsibility.exercise_1.bad.Country;
import single_responsibility.exercise_1.bad.Product;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ProductTest {

    private static Stream<Arguments> productAndTaxes() {
        return Stream.of(
                arguments(Country.SPAIN, 0.6594, 2, 1.3188),
                arguments(Country.GERMANY, 0.5966, 2, 1.1932),
                arguments(Country.UK, 0.6280000000000001, 2, 1.2560000000000002),
                arguments(Country.FRANCE, 0.6280000000000001, 2, 1.2560000000000002)
        );
    }

    @ParameterizedTest
    @MethodSource("productAndTaxes")
    void productWithCountryVat_calculateThePriceCorrectly(final Country country,
                                                          final double tax,
                                                          final int quantity,
                                                          final double taxForOrder){
        Product myProduct = new Product("myProduct", 3.14);

        assertEquals(tax, myProduct.calculateTax(country));
        assertEquals(taxForOrder, myProduct.calculateTaxForOrder(quantity, country));
    }
}