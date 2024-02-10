package ShapeInfo;

public class Rectangle extends Shape{
    private double length;
    private double width;

    // Constructors

    public Rectangle(String shape, String color, double length, double width) {
        super(color, shape); // Call the parameterized constructor of the base class
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public boolean isSquare(){
        if (length==width) return true;
        else return false;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a " + getColor() + " rectangle with area " + calculateArea());
    }
}
