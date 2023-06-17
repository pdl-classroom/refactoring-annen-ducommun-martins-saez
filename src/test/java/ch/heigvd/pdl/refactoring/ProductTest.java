package ch.heigvd.pdl.refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product("Carpet", ProductColor.BLUE, ProductSize.XXL, 13.37, "TRY");
    @Test
    void ProductColor() {
        assertEquals(ProductColor.BLUE, product.getColor());
    }

    @Test
    void ProductColorValue() {
        assertEquals("blue", product.getColor().toString());
    }

    @Test
    void ProductSize() {
        assertEquals(ProductSize.XXL, product.getSize());
    }

    @Test
    void ProductSizeValue() {
        assertEquals("XXL", product.getSize().toString());
    }
}
