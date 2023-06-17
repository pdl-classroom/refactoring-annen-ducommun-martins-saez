package ch.heigvd.pdl.refactoring;

public enum ProductSize {
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL"),
    INVALID_SIZE("Invalid Size");

    public final String label;

    ProductSize(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
