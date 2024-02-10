package ShapeInfo;

public class Rectangle extends Shape{
    private double length;
    private double width;

    // Constructors
    public Rectangle() {
        super(); // Call the constructor of the base class
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(String color, String shape, double length, double width) {
        super(color,shape); // Call the parameterized constructor of the base class
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {

        return length * width;
    }

    // Overriding displayInfo method from the base class
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" length " + length + " and width " + width + ".");
    }
}
