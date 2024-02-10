package Abstraction;

public class ARectangle extends AShape {
    private double length;
    private double width;

    public ARectangle(String color, String shape, double length, double width) {
        super(color, shape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
