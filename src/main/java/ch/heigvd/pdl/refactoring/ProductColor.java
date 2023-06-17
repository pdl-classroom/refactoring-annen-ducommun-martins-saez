package ch.heigvd.pdl.refactoring;

public enum ProductColor {
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    NO_COLOR("no color");
    public final String label;

    ProductColor(String label) {
        this.label = label;
    }
    @Override
    public String toString() {
        return this.label;
    }
}
