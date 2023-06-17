package ch.heigvd.pdl.refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductWriterTest {

    @Test
    void OneProduct() {
        Product p = new Product("Shirt", ProductColor.BLUE, ProductSize.M, 2.99, "TWD");
        assertEquals("{\"code\": \"Shirt\", \"color\": \"blue\", \"size\": \"M\", \"price\": 2.99, \"currency\": \"TWD\"}", new ProductWriter(p).getContents());
    }
}
