package Abstraction;

abstract public class AShape {
    private String color;
    private String shape;
    public AShape(String color, String shape) {
        this.color = color;
        this.shape=shape;
    }

    public String getColor() {
        return color;
    }
    public String getShape() {
        return shape;
    }
    abstract public double calculateArea();

    public void displayInfo() {
        System.out.println("This is a " + getColor() + " "+ getShape()+".");
    }
}
