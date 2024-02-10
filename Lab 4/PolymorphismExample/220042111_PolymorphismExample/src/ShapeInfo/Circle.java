package ShapeInfo;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius, String color, String shape) {
        super(color, shape);
        this.radius = radius;
    }

//setter getter

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The area is " + calculateArea());
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
