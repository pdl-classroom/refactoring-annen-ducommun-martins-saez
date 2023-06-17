package ch.heigvd.pdl.refactoring;

public class ProductWriter {

    private Product product;

    public ProductWriter(Product product) {
        this.product = product;
    }

    public String getContents() {
        StringBuilder sb = new StringBuilder("{");

        sb.append("\"code\": \"");
        sb.append(product.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(product.getColor());
        sb.append("\", ");

        if (product.getSize() != ProductSize.INVALID_SIZE) {
            sb.append("\"size\": \"");
            sb.append(product.getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(product.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(product.getCurrency());
        sb.append("\"}");

        return sb.toString();
    }
}